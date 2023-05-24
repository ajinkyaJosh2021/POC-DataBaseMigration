package com.hdfc.data.poc.data.migration.entity;

import java.sql.Timestamp;

public class ErrorDetailsHistory {


    private int id;

    private String txnId;
    private String channelId;

    private String errorCode;
    private String errorText;

    private String epicName;
    private Timestamp makerDate;
    private String status;

    private String action;

    private String checkerId;
    private String makerId;
    private Timestamp checkerDate;

    private String reqNo;
}