package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ERROR_DETAILS_HISTORY")
@Data
public class ErrorDetailsHistory {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "TXN_ID")
    private String txnId;

    @Column(name = "CHANNEL_ID")
    private String channelId;

    @Column(name = "ERROR_CODE")
    private String errorCode;
    @Column(name = "ERROR_TEXT")
    private String errorText;

    @Column(name = "EPIC_NAME")
    private String epicName;

    @Column(name = "MAKER_DATE")
    private Timestamp makerDate;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "ACTION")
    private String action;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "CHECKER_DATE")
    private Timestamp checkerDate;

    @Column(name = "REQ_NO")
    private String reqNo;
}