package com.hdfc.data.poc.data.migration.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class BankTransactionMaster {

    private String id;

    private String name;

    private String subId;

    private String auditFlag;

    private String routeId;

    private String parentKey;

    private String mbFlag;

    private String nbFlag;

    private String rbiFlag;

    private String bankTxnId;

    private String reportEnabledFlag;

    private String epic;

    private Character deviceFlag;

    private String damFlag;

    private String categorization;

    private String logAuditFlag;

    private String interfaceAuditFlag;

    private String userTrackingBypass;
}
