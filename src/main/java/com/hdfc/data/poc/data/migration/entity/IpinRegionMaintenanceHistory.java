package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class IpinRegionMaintenanceHistory {

    private Long id;

    private String branchCode;

    private String region;
    private String branchName;
    private String makerId;
    private String checkerId;

    private Timestamp datCreated;
    private Timestamp checkerDate;
    private Timestamp datModified;
private String status;

    private String action;

    private Timestamp migDate;

    private String requestNo;

}
