package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class UserRoleHistory {

    private Long id;

    private String custId;

    private String roleId;

    private String idApp;

    private String makerId;

    private String checkerId;

    private Timestamp makerDate;

    private Timestamp checkerDate;

    private String migData;

    private String requestNo;

    private Timestamp createdDate;

    private String status;
    private String action;

    private Timestamp hsCreatedTime;

}
