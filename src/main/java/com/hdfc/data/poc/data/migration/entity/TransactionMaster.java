package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TransactionMaster {
    private String idTxn;
    private String description;
    private Timestamp createdDate;
    private Timestamp modifiedDate;
    private Timestamp makerDate;
    private Timestamp checkerDate;
    private String checkerId;

    private String makerId;

    private String requestNo;

    private String menu;
    private String subMenu;

    private String bankTransactionId;

    private String applicationId;

    private String epic;
    private String grouping;
    private String action;

    private String transactionOrder;

    private String pageLink;
    private String transactionType;

}
