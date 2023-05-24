package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the UPLOAD_REJECT database table.
 */
@Entity
@Table(name = "UPLOAD_REJECT")
@Data
public class UploadReject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String checkerid;

    @Column(name = "datcheck")
    private Timestamp checkerDate;

    @Column(name = "datmake")
    private Timestamp makerDate;

    private String filename;

    @Column(name = "MAKER_ID")
    private String makerId;

    @Column(name = "REASON_FOR_FAILURE")
    private String reasonForFailure;

    @Column(name = "REQ_NO")
    private String reqNo;

    private String request;

    @Column(name = "\"TRANSACTION\"")
    private String transaction;

    @Column(name = "UPLOAD_FLG")
    private String uploadFlg;
}


