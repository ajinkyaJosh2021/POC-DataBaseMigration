package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class P2AExcludedIfscCodes {
private String ifscCode;
    private String bankCode;
    private Character flgMntStatus;
    private Character flgMntAction;
    private String makerId;
    private Timestamp makerDate;
    private String checkerId;
    private Timestamp checkerDate;
    private Timestamp migDate;
    private String reqNo;
    private Timestamp createdDate;
}
