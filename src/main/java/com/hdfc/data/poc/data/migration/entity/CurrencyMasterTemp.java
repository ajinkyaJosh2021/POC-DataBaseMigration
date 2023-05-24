package com.hdfc.data.poc.data.migration.entity;

import java.sql.Timestamp;

public class CurrencyMasterTemp {

    private Long id;

    private String code;

    private String name;

    private Double inrEquivalent;

    private String symbol;

    private String productCode;

    private String altCode;
    private String makerId;

    private String checkerId;

    private String status ="PENDING";

    private String flgMntAction;

    private Timestamp checkerDate;

    private Timestamp makerDate;

    private String fcnrFlag;

    private String fcurrFlag;

    private String forexFlag;

    private String reqNo;

    private Timestamp dateCreate;

}
