package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TxnAppCategoryMapping {

    private TxnAppCategoryMappingPK txnAppCategoryMappingPK;

    private Timestamp dateCreated;

    private Timestamp dateChecker;

    private String makerId;

    private Timestamp dateMaker;

    private Timestamp checkerId;

    private String reqNo;

    private String action;
}
