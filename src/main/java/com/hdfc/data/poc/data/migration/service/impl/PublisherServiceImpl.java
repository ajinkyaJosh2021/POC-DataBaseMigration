package com.hdfc.data.poc.data.migration.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hdfc.data.poc.data.migration.DTO.PubSubMessageDTO;
import com.hdfc.data.poc.data.migration.enums.PubSubAction;
import com.hdfc.data.poc.data.migration.enums.PubSubType;
import com.hdfc.data.poc.data.migration.postgres.entity.PubSubLogsMaster;
import com.hdfc.data.poc.data.migration.postgres.entity.TxnTopicMappingMaster;
import com.hdfc.data.poc.data.migration.postgres.repository.PubSubLogsRepository;
import com.hdfc.data.poc.data.migration.postgres.repository.TxnTopicMappingRepository;
import com.hdfc.data.poc.data.migration.service.PublisherService;
import com.hdfc.messaging.service.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ThreadPoolExecutor;

@Service
@Slf4j
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private TxnTopicMappingRepository txnTopicMappingRepository;

    @Autowired
    private ProducerService producerService;
    public static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Autowired
    @Qualifier(value = "threadPoolForPubSub")
    private ThreadPoolExecutor threadPoolExecutor;

    @Autowired
    private PubSubLogsRepository pubSubLogsRepository;

    @Override
    public void publishEvent(String txnId, Object data, PubSubType pubSubType, PubSubAction pubSubAction) {

        List<TxnTopicMappingMaster> txnTopicMappingMasters = txnTopicMappingRepository.findByTxnIdAndType(txnId, pubSubType.name());
        Map<String, Object> dataMp = new HashMap<>();
        if (data != null) {
            dataMp = convertValue(data, Map.class);
        }
        for (TxnTopicMappingMaster txnTopicMappingMaster : txnTopicMappingMasters) {

            PubSubMessageDTO pubSubMessageDTO = new PubSubMessageDTO(pubSubType.toString(), pubSubAction.name(), UUID.randomUUID().toString(), "SYSTEM", dataMp, pubSubType.getIdentifiers());
            log.info("Giving call to thread pool execute");

            threadPoolExecutor.execute(()->{

                log.info("Started publish method");

                PubSubLogsMaster pubSubLogsMaster = null;
                String eventId = UUID.randomUUID().toString();
                Map<String, Object> payload = null;
                try {
                    //publish actual event
                    String publishedId = producerService.send(txnTopicMappingMaster.getTopic(), pubSubMessageDTO);

                    //converting it into map in order to post it in event and save it in logs
                    payload = convertValue(pubSubMessageDTO, Map.class);

                    //create the log entry entity
                    pubSubLogsMaster = new PubSubLogsMaster(txnTopicMappingMaster.getTopic(), eventId, null, payload);
                    if (publishedId != null) {
                        log.info("Event published for the topic {} with event payload {}",txnTopicMappingMaster.getTopic(),pubSubMessageDTO);
                        pubSubLogsMaster.setPublishStatus("Y");
                        pubSubLogsMaster.setPublishedId(publishedId);
                    }
                } catch (Exception ex) {
                    log.error("Exception in publishEvent ", ex);
                    pubSubLogsMaster = new PubSubLogsMaster(txnTopicMappingMaster.getTopic(), eventId, null, payload);
                }
                pubSubLogsMaster.setUpdatedDate(new Timestamp(System.currentTimeMillis()));
                pubSubLogsRepository.save(pubSubLogsMaster);
                log.info("Completed publish method");
            });
        }

    }

    public static <T> T convertValue(Object object, Class<T> classObj) {
        return OBJECT_MAPPER.convertValue(object, classObj);
    }
}
