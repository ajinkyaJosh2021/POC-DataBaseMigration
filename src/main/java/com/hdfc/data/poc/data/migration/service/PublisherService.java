package com.hdfc.data.poc.data.migration.service;

import com.hdfc.data.poc.data.migration.enums.PubSubAction;
import com.hdfc.data.poc.data.migration.enums.PubSubType;

public interface PublisherService {

    void publishEvent(String txnId, Object data, PubSubType pubSubType, PubSubAction pubSubAction);
}
