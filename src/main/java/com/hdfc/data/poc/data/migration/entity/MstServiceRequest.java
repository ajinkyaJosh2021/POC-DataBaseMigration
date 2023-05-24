package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MstServiceRequest {

    private String idService;
    private String description;
    private String flgRSAEnabled;
    private String fldRSAReqd;
    private String successURL;
    private String failureURL;
    private String redirectMode;
    private String makerId;
    private Timestamp makerDate;
    private String checkerId;
    private Timestamp checkerDate;
    private String flgStatus;
    private String masterKey;
    private Timestamp	migDat;
    private String reqNo;
    private String flgMntAction;
    private Timestamp dateCreated;
}
