package com.hdfc.data.poc.data.migration.entity;

import java.sql.Timestamp;

public class ErrorDetails {

    private ErrorDetailsPk errorDetailsPk;

    private String errorText;

    private String checkerId;

    private String makerId;
    private Timestamp checkerDate;
    private Timestamp makerDate;

    private String reqNo;

    private String action;
}
