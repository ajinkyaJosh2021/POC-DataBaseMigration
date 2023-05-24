package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TptDeRegistrationTemp {

    private String customerId;
    private String makerId;
    private String requestNo;
    private Timestamp makerDate;
}
