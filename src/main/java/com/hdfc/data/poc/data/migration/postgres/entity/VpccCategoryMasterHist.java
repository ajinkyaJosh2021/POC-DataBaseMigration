package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "VPCC_CATEGORY_MASTER_HIST")
@Data
@NamedQuery(name = "VpccCategoryMasterHist.findAll", query = "SELECT v FROM VpccCategoryMasterHist v")
public class VpccCategoryMasterHist implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HISTORY_ID")
    private Long id;

    @Embedded
    private CategoryMasterPK categoryMasterPK;

    @Column(name = "SL_NO")
    private String slNum;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "MODIFIED_DATE")
    private Timestamp modifiedDate;

    @Column(name = "CREATED_DT")
    private Timestamp createdDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "CHECKERDATE")
    private Timestamp checkerDate;

    @Column(name = "DELETE_REASON")
    private String reasonForDeletion;

    private String status;

    private String action;
}
