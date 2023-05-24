package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class FCNRCountryHist {

    private Long id;
    private String countryCode;
    private String countryName;
    private Timestamp migDat;
    private String makerId;
    private String checkerId;
    private String reqNo;
    private String status;
    private String flgMnt;
    private Timestamp makerDate;
    private Timestamp checkerDate;
    private String deleteReason;

}
