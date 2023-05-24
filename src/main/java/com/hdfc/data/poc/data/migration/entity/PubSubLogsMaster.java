package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Data
public class PubSubLogsMaster {

    private Integer id;
private String topic;

    private String eventId;

    private Map<String, Object> payload = new HashMap<>();
    private String eventType;

    private String publishStatus;

    private String publishedId;

    private Timestamp createdDate;

    private Timestamp updatedDate;

    public PubSubLogsMaster() {
    }


}
