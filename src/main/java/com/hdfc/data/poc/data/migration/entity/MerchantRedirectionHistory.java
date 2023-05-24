package com.hdfc.data.poc.data.migration.entity;

import java.sql.Timestamp;

public class MerchantRedirectionHistory {

    private Long id;
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

    private String redirect;

}
