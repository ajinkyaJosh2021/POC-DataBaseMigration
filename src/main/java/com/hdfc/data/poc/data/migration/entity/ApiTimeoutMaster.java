package com.hdfc.data.poc.data.migration.entity;

import java.sql.Timestamp;

public class ApiTimeoutMaster {

    private Long id;

    private String channel;
    private String apiHostKey;

    private String apiEndPoint;

    private String apiMethod;

    private Integer timeout;

    private String makerId;

    private Timestamp makerDate;

    private String checkerId;

    private Timestamp checkerDate;

    private String reqNo;

}
