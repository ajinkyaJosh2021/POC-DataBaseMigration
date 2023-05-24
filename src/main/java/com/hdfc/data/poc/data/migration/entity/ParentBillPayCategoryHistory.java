package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ParentBillPayCategoryHistory {

    private Long historyId;

    private String parentCategory;

    private int parentCategorySeq;
    private String makerId;

    private Timestamp makerDate;

    private String checkerId;

    private Timestamp checkerDate;
    private Timestamp dateModified;

    private String reqNo;
}
