package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the MSTGLOBALLIMIT_HISTORY database table.
 */
@Entity
@Table(name = "MSTGLOBALLIMIT_HISTORY")
@Data
public class MstgloballimitHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "history_id")
    private Integer historyId;

    private String band;

    @Column(name = "checkerid")
    private String checkerId;

    @Column(name = "custtype")
    private String custType;

    @Column(name = "datcheck")
    private Timestamp dateCheck;

    @Column(name = "datmake")
    private Timestamp dateMake;

    @Column(name = "etheniccode")
    private String ethenicCode;

    @Column(name = "FLG_MNT_ACTION")
    private String flgMntAction;

    @Column(name = "FLG_MNT_STATUS")
    private String flgMntStatus;

    private String idlimit;

    @Column(name = "limitamt")
    private String limitAmt;

    @Column(name = "makerid")
    private String makerId;

    @Column(name = "REASON_FOR_REJECTION")
    private String reasonForRejection;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "delete_reason")
    private String deleteReason;

}
