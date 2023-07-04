package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "ALERTS_TEMPLATE")
@AllArgsConstructor
@NoArgsConstructor
public class AlertsTemplate {

    @EmbeddedId
    AlertTemplatePK alertTemplatePK;

    @Column(name = "id")
    private String id;

    @Column(name = "temp_id")
    private String tempId;

    @Column(name = "txn_id")
    private String txnId;

    @Column(name = "message")
    private String message;

    @Column(name = "arg0")
    private String arg0;

    @Column(name = "arg1")
    private String arg1;

    @Column(name = "arg2")
    private String arg2;

    @Column(name = "arg3")
    private String arg3;

    @Column(name = "arg4")
    private String arg4;

    @Column(name = "arg5")
    private String arg5;

    @Column(name = "arg6")
    private String arg6;

    @Column(name = "arg7")
    private String arg7;

    @Column(name = "arg8")
    private String arg8;

    @Column(name = "arg9")
    private String arg9;

    @Column(name = "arg10")
    private String arg10;

    @Column(name = "RETURN_CODE")
    private String returnCode;

    @Column(name = "MAKER_ID")
    private String makerId;

    @Column(name = "MAKER_DATE")
    private Timestamp makerDate;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "CHECKER_DATE")
    private Timestamp checkerDate;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "ACTION")
    private String action;



}