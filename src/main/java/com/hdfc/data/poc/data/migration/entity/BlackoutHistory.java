package com.hdfc.data.poc.data.migration.entity;

import java.sql.Timestamp;

public class BlackoutHistory {
    private Long id;

    private String txnId;

    private String message;

    private String epic;

    private Timestamp startTime;

    private Timestamp endTime;

    private String status;

    private String appId;

    private Timestamp reqDate;

    private String reqId;

    private String channelId;

    private String makerId;

}
