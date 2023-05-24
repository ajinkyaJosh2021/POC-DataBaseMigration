package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * The persistent class for the MSTGLOBALLIMIT_HISTORY database table.
 */
@Data
public class MstgloballimitHistory {

    private Integer historyId;

    private String band;

    private String checkerId;

    private String custType;

    private Timestamp dateCheck;
    private Timestamp dateMake;

    private String ethenicCode;

    private String flgMntAction;

    private String flgMntStatus;

    private String idlimit;

    private String limitAmt;

    private String makerId;

    private String reasonForRejection;
    private String reqNo;

    private String deleteReason;

}
