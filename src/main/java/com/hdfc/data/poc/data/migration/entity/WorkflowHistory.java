package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Data
public class WorkflowHistory {

    private Long historyId;

    private String requestNo;
    private String requestType;

    private Timestamp createdDate;
    private String status;

    private String action;

    private String reason;
    private Map<String, Object> data = new HashMap<>();

    private String makerId;

    private Timestamp makerDate;

    private String checkerId;

    private Timestamp checkerDate;

    private String bulkUploadFlag;

    private String approveTxnId;
}
