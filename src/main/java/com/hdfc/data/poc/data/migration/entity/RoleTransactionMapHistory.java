package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class RoleTransactionMapHistory {

    private Integer historyId;

    private RoleTransactionMapPk roleTransactionMapPk;
    private Timestamp createdDate;

    private Timestamp modifiedDate;
    private Timestamp makerDate;
    private Timestamp checkerDate;

    private String makerId;

    private String checkerId;

    private String requestNumber;

    private String action;

}
