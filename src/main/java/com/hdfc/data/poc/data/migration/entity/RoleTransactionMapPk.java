package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleTransactionMapPk implements Serializable {
    private String idRole;
    private String idTxn;
}
