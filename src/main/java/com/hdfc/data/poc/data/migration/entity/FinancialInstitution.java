package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class FinancialInstitution implements Serializable {

    private Long institutionCode;

    private String institutionName;

    private String makerId;

    private Timestamp checkerdate;

    private String checkerId;

    private Timestamp makerdate;
    private String flgMntAction;

    private String flgMntStatus;

    private Timestamp datCreated;

    private String reqNo;


}
