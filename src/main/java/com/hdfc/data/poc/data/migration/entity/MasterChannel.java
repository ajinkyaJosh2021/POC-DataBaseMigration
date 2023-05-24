package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MasterChannel {

    private String idChannel;

    private String description;
    private Timestamp createdDate;
    private Timestamp modifiedDate;
    private Timestamp makerDate;
    private Timestamp checkerDate;
    private String checkerId;
    private String makerId;
    private String requestNo;
    private String action;
}
