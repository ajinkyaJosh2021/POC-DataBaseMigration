package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class VisaAmtTxn {
    private String id;
    private String refNo;
    private String senderName;
    private String acctNo;
    private String description;
    private String recvName;
    private String visaCardNo;
    private Timestamp datTxn;
    private Long amount;
    private Long errorCode;
    private String errorDesc;
}

