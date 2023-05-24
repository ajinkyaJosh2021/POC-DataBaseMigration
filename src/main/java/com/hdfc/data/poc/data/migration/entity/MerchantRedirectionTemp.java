package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MerchantRedirectionTemp {

    private String merchantCode;

    private String merchantPath;

    private String makerId;

    private String checkerId;

    private Timestamp makerDate;

    private Timestamp checkerDate;

    private Timestamp createdDate;

    private Timestamp migrationDate;

    private String requestNo;

    private String action;

    private String status;

    private String uploadAction;

    private String redirect;

}
