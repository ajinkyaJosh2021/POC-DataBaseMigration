package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

@Data
public class TxnTopicMappingMaster {

    private Integer id;

    private String txnId;

    private String topic;

    private String type;

}
