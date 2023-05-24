package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MstCustTPTLimitTemp {
    private Long id;

    private String bulkUploadFlg;

    private String checkerId;

    private String customerId;

    private Timestamp datCheck;

    private Timestamp datMake;

    private String filename;

    private String flgMntAction;

    private String flgMntStatus;

    private String limitAmt;

    private String makerId;

    private String modProcess;

    private String reqNo;

}
