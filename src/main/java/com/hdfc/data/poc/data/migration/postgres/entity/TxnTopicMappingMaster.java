package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MST_TXN_TOPIC")
@Data
public class TxnTopicMappingMaster {

    @Id
    private Integer id;

    @Column(name = "txnid")
    private String txnId;

    @Column(name = "topic")
    private String topic;

    @Column(name = "type")
    private String type;

}
