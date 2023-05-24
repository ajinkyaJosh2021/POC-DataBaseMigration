package com.hdfc.data.poc.data.migration.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class CctxnHistory implements Serializable {
    private String id;

    private String binNo;

    private String blockCode;

    private String checkerId;

    private Timestamp checkerDate;

    private Timestamp datCreated;

    private Timestamp makerDate;

    private Timestamp datModified;

    private String flgMntStatus;

    private String appId;

    private String txnId;

    private String logoNo;
    private String makerId;
    private Timestamp migDat;

    private String mntAction;

    private String reqNo;
}
