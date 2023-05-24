package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class FCNRCountry {
    private String countryCode;

    private String countryName;

    private Timestamp migDat;

    private String makerId;

    private String checkerId;

    private String reqNo;
    private String status;
    private String flgMnt;

    private Timestamp datMake;

    private Timestamp datCheck;

    private Timestamp datCreated;


}
