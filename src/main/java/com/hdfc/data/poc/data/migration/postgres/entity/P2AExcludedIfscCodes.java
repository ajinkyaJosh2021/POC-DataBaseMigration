package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "P2AEXCLUDEDIFSCCODES")
@AllArgsConstructor
@NoArgsConstructor
public class P2AExcludedIfscCodes {

    @Id
    @Column(name = "IFSCCODE")
    private String ifscCode;

    @Column(name = "BANKCODE")
    private String bankCode;

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

    @Column(name = "MIG_DATE")
    private Timestamp migDate;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "DATE_CTREATED")
    private Timestamp createdDate;

    public P2AExcludedIfscCodes(String ifscCode, String bankCode, String makerId, Timestamp makerDate, String checkerId, Timestamp checkerDate, Timestamp createdDate) {
        this.ifscCode = ifscCode;
        this.bankCode = bankCode;
        this.makerId = makerId;
        this.makerDate = makerDate;
        this.checkerId = checkerId;
        this.checkerDate = checkerDate;
        this.createdDate = createdDate;
    }
}
