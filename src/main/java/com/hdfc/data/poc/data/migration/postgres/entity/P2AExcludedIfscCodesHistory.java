package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "P2AEXCLUDEDIFSCCODES_History")
@AllArgsConstructor
@NoArgsConstructor
public class P2AExcludedIfscCodesHistory {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BANKCODE")
    private String bankCode;

    @Column(name = "IFSCCODE")
    private String ifscCode;

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

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "DATE_CTREATED")
    private Timestamp createdDate;
}
