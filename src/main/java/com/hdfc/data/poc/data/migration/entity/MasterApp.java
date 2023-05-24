package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MasterApp {

    private String idApp;
    private String description;

    private String checkerId;
    private String makerId;

    private Timestamp dateCreated;

    private Timestamp dateModify;
    private Timestamp dateCheck;
    private String reqNo;

    private Timestamp makerDate;

    private String action;
}
