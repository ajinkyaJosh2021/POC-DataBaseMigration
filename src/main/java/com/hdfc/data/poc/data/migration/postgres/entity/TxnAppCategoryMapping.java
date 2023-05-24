package com.hdfc.data.poc.data.migration.postgres.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TXN_APP_CAT_MAPPING")
public class TxnAppCategoryMapping {

    @EmbeddedId
    private TxnAppCategoryMappingPK txnAppCategoryMappingPK;

    @Column(name = "DAT_CREATED")
    private Timestamp dateCreated;

    @Column(name = "DATCHECK")
    private Timestamp dateChecker;

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "DATMAKE")
    private Timestamp dateMaker;

    @Column(name = "CHECKERID")
    private Timestamp checkerId;

    @Column(name = "REQ_")
    private String reqNo;

    @Column(name = "ACTION")
    private String action;
}
