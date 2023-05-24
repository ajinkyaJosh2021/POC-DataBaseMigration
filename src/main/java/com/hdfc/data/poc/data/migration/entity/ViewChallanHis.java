package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ViewChallanHis{

    private Long historyId;

    private String reqNo;

    private String merchantCode ;

    private String url;

    private String enableStatus;

    private String makerId;

    private String status;

    private Timestamp makerDate;

    private String checkerId;

    private Timestamp checkerDate;

    private String flgMntAction;

    private Timestamp actionDate;
}
