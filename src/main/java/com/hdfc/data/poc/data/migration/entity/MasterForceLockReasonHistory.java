package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MasterForceLockReasonHistory {

    private Long id;

    private Long reasonId;

    private String reasonType;
    private String reason;

    private String checkerId;

    private String makerId;

    private Timestamp createdDate;

    private Timestamp checkerDate;

    private String reqNo;

    private Timestamp makerDate;

}
