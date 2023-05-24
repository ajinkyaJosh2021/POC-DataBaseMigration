package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class SyschecksumxrefHis {
    private Long historyId;

    private String systemId;
private String checkerId;

    private Timestamp dateCheck;

    private Timestamp dateCreated;

    private Timestamp dateMake;

    private String flgMntAction;

    private String key;

    private String makerId;

    private String merchantId;

    private Timestamp migDate;
    private String reqNo;

    private String status;

}
