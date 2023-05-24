package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class P2AExcludedIfscCodesHistory {
    private Long id;

    private String bankCode;

    private String ifscCode;

    private Character flgMntStatus;

    private Character flgMntAction;
    private String makerId;

    private Timestamp makerDate;

    private String checkerId;

    private Timestamp checkerDate;

    private String reqNo;

    private Timestamp createdDate;
}
