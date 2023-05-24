package com.hdfc.data.poc.data.migration.postgres.entity;


import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "CURRENCY_MASTER_HIS")
@Data
public class CurrencyMasterHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HISTORY_ID")
    private Long id;

    @Column(name = "CURRENCY_CODE")
    private String code;

    @Column(name = "CURRENCY_NAME")
    private String name;

    @Column(name = "INR_EQUIVALENT")
    private Double inrEquivalent;

    @Column(name = "CURRENCY_SYMBOL")
    private String symbol;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "CURR_ALT_CODE")
    private String altCode;

    @Column(name = "MAKER_ID")
    private String makerId;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "FLG_MNT_ACTION")
    private String flgMntAction;

    @Column(name = "CHECKER_DATE")
    private Timestamp checkerDate;

    @Column(name = "MAKER_DATE")
    private Timestamp makerDate;

    @Column(name = "FCNR_FLAG")
    private String fcnrFlag;

    @Column(name = "FCURR_FLAG")
    private String fcurrFlag;

    @Column(name = "FOREX_FLAG")
    private String forexFlag;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "DAT_CREATED")
    private Timestamp dateCreated;

    @Column(name = "DELETE_REASON")
    private String resonForDeletion;
}
