package com.hdfc.data.poc.data.migration.entity;


import lombok.Data;

import java.sql.Timestamp;

@Data
public class MasterAdminUserHistory {

    private Long id;
    private String empCode;
    private Integer deptCode;
    private String userGroup;
    private String firstName;
    private String branchCode;
    private String branchName;
    private String userOrg;
    private Timestamp expiryDate;
    private Timestamp creationDate;
    private Timestamp lastSuccessLoginDate;
    private Timestamp lastFailedLoginDate;
    private String activeFlag;
    private Character lockFlag;
    private String makerId;
    private String checkerId;
    private Timestamp dateMaker;
    private Timestamp dateChecker;
    private Timestamp migDate;
    private String action;
    private String requestId;
    private Character forcedLockFlag;
    private Integer lockCounter = 0;

}
