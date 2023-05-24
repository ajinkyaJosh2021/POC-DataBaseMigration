package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
@Data
public class VpccCategoryMasterHist implements Serializable {

    private Long id;

    private CategoryMasterPK categoryMasterPK;
    private String slNum;

    private String modifiedBy;
    private Timestamp modifiedDate;
    private Timestamp createdDate;
    private String createdBy;
    private String reqNo;
    private String checkerId;
    private Timestamp checkerDate;
    private String reasonForDeletion;

    private String status;

    private String action;
}
