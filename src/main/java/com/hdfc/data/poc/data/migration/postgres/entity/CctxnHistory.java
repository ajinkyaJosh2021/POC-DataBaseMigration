package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CCTXN_HISTORY")
public class CctxnHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "bin")
    private String binNo;

    private String blockCode;

    @Column(name = "checkerid")
    private String checkerId;

    @Column(name = "datcheck")
    private Timestamp checkerDate;

    @Column(name = "datcreated")
    private Timestamp datCreated;

    @Column(name = "datmake")
    private Timestamp makerDate;

    @Column(name = "datModified")
    private Timestamp datModified;

    @Column(name = "FLG_MNT_STATUS")
    private String flgMntStatus;

    @Column(name = "idapp")
    private String appId;

    @Column(name = "idtxn")
    private String txnId;

    @Column(name = "logo")
    private String logoNo;

    @Column(name = "makerid")
    private String makerId;

    @Column(name = "MIG_DAT")
    private Timestamp migDat;

    @Column(name = "mntaction")
    private String mntAction;

    @Column(name = "REQ_NO")
    private String reqNo;
}
