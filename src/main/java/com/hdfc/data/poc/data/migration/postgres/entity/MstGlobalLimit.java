package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "MSTGLOBALLIMIT")
@Data
@NoArgsConstructor
public class MstGlobalLimit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idlimit;

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

    @Column(name = "limitamt")
    private String limitAmt;

    @Column(name = "makerid")
    private String makerId;

    @Column(name = "REQ_NO")
    private String reqNo;


}
