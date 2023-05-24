package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MasterRole {

    private String idRole;

    private String appId;

    private Timestamp createdDate;
    private Timestamp modifiedDate;
    private String description;
    private Timestamp makerDate;
    private Timestamp checkerDate;
    private String checkerId;
    private String makerId;
    private String requestNo;

    private String status;
    private String roleSubType;
    private String action;
    private String userGroup;
    private String authority;


}
