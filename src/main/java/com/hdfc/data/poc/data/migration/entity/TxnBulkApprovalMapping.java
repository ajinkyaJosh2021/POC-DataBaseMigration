package com.hdfc.data.poc.data.migration.entity;


import lombok.Data;

@Data
public class TxnBulkApprovalMapping {

    private Long id;

    private String txnId;
    private String bulkApprovalFlag;
}
