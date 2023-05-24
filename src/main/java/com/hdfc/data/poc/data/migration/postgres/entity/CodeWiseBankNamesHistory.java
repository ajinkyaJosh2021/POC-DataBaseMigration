package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "CODEWISEBANKNAMESHIST")
public class CodeWiseBankNamesHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pId")
    private Long pId;

    @Column(name = "BANKCODE")
    private String bankCode;

    @Column(name = "BANKNAME")
    private String bankName;

    @Column(name = "FLG_MNT_STATUS")
    private Character flgMntStatus;

    @Column(name = "FLG_MNT_ACTION")
    private Character flgMntAction;

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "MAKERDATE")
    private Timestamp makerDate;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "CHECKERDATE")
    private Timestamp checkerDate;

    @Column(name = "CCARD_IMPS_FLAG")
    private Character cCardImpsFlag;

    @Column(name = "MIG_DATE")
    private Timestamp migDate;

    @Column(name = "ID")
    private String id;

    @Column(name = "REQ_NO")
    private String reqNo;
}
