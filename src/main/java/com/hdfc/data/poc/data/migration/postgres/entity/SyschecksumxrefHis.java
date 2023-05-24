package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "SYSCHECKSUMXREF_HIS")
@Data
public class SyschecksumxrefHis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hist_id")
    private Long historyId;

    @Column(name = "SYSTEMID")
    private String systemId;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "DATCHECK")
    private Timestamp dateCheck;

    @Column(name = "DATCREATED")
    private Timestamp dateCreated;

    @Column(name = "DATMAKE")
    private Timestamp dateMake;

    @Column(name = "FLG_MNT_ACTION")
    private String flgMntAction;

    @Column(name = "\"KEY\"")
    private String key;

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "MERCHANTID")
    private String merchantId;

    @Column(name = "MIG_DAT")
    private Timestamp migDate;

    @Column(name = "REQ_NO")
    private String reqNo;

    private String status;

}
