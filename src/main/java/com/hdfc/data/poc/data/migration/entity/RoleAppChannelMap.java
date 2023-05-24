package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class RoleAppChannelMap {

    RoleAppChannelMapPk roleAppChannelMapPk;

    private String isDefault;

    private Timestamp createdDate;

    private Timestamp modifiedDate;

    private Timestamp makerDate;

    private Timestamp checkerDate;

    private String makerId;

    private String checkerId;

    private String requestNumber;

    private String action;
}
