package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TxnAppCategoryMappingPK implements Serializable {
    private String bbTxnId;

    private String appId;

    private String category;
}
