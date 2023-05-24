package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationMapPK implements Serializable {

    private static final long serialVersionUID = 2140464616256177734L;
    @Column(name = "TXN_ID")
    private String txnId;

    @Column(name = "CHANNEL")
    private String channel;

    @Column(name = "CUST_TYPE")
    private String custType;
}
