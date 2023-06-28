package com.hdfc.data.poc.data.migration.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PubSubMessageDTO {
    private String source;
    private String type;
    private String action;
    private boolean encrypted;
    private String eventId;
    private Long eventTimeStamp;
    private String triggeredBy;
    private Map<String, Object> data;
    private PubSubIdentifiersDTO identifiers = new PubSubIdentifiersDTO();


    public PubSubMessageDTO(String type, String action, String eventId, String triggeredBy, Map<String, Object> data,String[] identifiers) {
        this.type = type;
        this.action = action;
        this.eventId = eventId;
        this.triggeredBy = triggeredBy;
        this.data = data;
        this.identifiers.setKeys( Arrays.asList(identifiers));
        this.source = "ADMIN";
        this.eventTimeStamp = System.currentTimeMillis();
        this.encrypted = false;
    }

    @Override
    public String toString() {
        return "{" +
                "source:'" + source + '\'' +
                ", type:'" + type + '\'' +
                ", action:'" + action + '\'' +
                ", encrypted:" + encrypted +
                ", eventId:'" + eventId + '\'' +
                ", eventTimeStamp:" + eventTimeStamp +
                ", triggeredBy:'" + triggeredBy + '\'' +
                ", data:" + data +
                '}';
    }
}

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
class PubSubIdentifiersDTO{
    private List<String> keys;
    private Map<String, Object> oldData;
}
