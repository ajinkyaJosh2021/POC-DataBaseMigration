package com.hdfc.data.poc.data.migration.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class Cctxn implements Serializable {

    private CctxnPK id;

    private String checkerId;

    private Timestamp checkerDate;

    private Timestamp datCreated;

    private Timestamp makerDate;
    private Timestamp dateModified;

    private String makerId;

    private Timestamp migDat;

    private String mntAction;

    private String reqNo;

}
