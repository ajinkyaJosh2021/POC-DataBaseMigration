package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "IB_COUNTRY_FCNR_HIST")
@Data
public class FCNRCountryHist {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HISTORY_ID")
    private Long id;
    @Column(name = "COUNTRY_CODE")
    private String countryCode;
    @Column(name = "COUNTRY_NAME")
    private String countryName;
    @Column(name = "MIG_DAT")
    private Timestamp migDat;
    @Column(name = "MAKER_ID")
    private String makerId;
    @Column(name = "CHECKER_ID")
    private String checkerId;
    @Column(name = "REQ_NO")
    private String reqNo;
    @Column(name = "FLG_MNT_STATUS")
    private String status;
    @Column(name = "FLG_MNT_ACTION")
    private String flgMnt;
    @Column(name = "DATMAKE")
    private Timestamp makerDate;
    @Column(name = "DATCHECK")
    private Timestamp checkerDate;
    @Column(name = "delete_reason")
    private String deleteReason;

}
