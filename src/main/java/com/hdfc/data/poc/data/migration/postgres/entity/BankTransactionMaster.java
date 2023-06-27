package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TXN_MASTER",schema = "hdfc")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankTransactionMaster {

    @Column(name = "ID")
    @Id
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SUB_ID")
    private String subId;

    @Column(name = "AUDIT_FLAG")
    private String auditFlag;

    @Column(name = "ROUTE_ID")
    private String routeId;

    @Column(name = "PARENT_KEY")
    private String parentKey;

    @Column(name = "MB_FLAG")
    private String mbFlag;

    @Column(name = "NB_FLAG")
    private String nbFlag;

    @Column(name = "RBI_FLAG")
    private String rbiFlag;

    @Column(name = "BANK_TXN_ID")
    private String bankTxnId;

    @Column(name = "REPORT_ENABLED_FLAG")
    private String reportEnabledFlag;

    @Column(name = "EPIC")
    private String epic;

    @Column(name = "DEVICE_FLG")
    private Character deviceFlag;

    @Column(name = "DAM_FLG")
    private String damFlag;

    @Column(name = "CATEGORIZATION")
    private String categorization;

    @Column(name = "LOG_AUDIT_FLAG")
    private String logAuditFlag;

    @Column(name = "INTERFACE_AUDIT_FLAG")
    private String interfaceAuditFlag;

    @Column(name = "USER_TRACKING_BYPASS")
    private String userTrackingBypass;
}
