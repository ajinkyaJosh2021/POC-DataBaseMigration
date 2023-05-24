package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "COUNTRY_DETAILS")
public class CountryCodeDetails {

    @Id
    @Column(name = "COUNTRY_CODE")
    private int countryCode;

    @Column(name = "COUNTRY_NAME")
    private String countryName;

    @Column(name = "ISO_CODES")
    private String isoCode;

    @Column(name = "MIG_DAT")
    private Timestamp migDat;

    @Column(name = "MAKER_ID")
    private String makerId;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "FLG_MNT_ACTION")
    private String flgMnt;

    @Column(name = "DATMAKE")
    private Timestamp datMake;

    @Column(name = "DATCHECK")
    private Timestamp datCheck;

    @Column(name = "DAT_CREATED")
    private Timestamp datCreated;

}