package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MstGlobalLimit {

    private Long idlimit;

    private String band;

    private String checkerId;

    private String custType;

    private Timestamp dateCheck;

    private Timestamp dateMake;

    private String ethenicCode;

    private String flgMntAction;

    private String limitAmt;

    private String makerId;

    private String reqNo;


}
