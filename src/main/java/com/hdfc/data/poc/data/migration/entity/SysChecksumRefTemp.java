package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class SysChecksumRefTemp implements Serializable {

    private SysChecksumXRefPK sysChecksumXRefPK;

    private String checkerId;

    private Timestamp dateCheck;

    private Timestamp dateCreated;

    private Timestamp dateMake;

    private String flgMntAction;

    private String key;

    private String makerId;

    private Timestamp migDate;
    private String reqNo;

    private String uploadAction;


    private String status;

}

