package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ViewChallan {

    private String merchantCode;
    private String url;

    private String enableStatus;

    private String reqNo;

    private String makerId;

    private String status;

    private Timestamp makerDate;

    private String checkerId;

    private Timestamp checkerDate;

    private String flgMntAction;

}
