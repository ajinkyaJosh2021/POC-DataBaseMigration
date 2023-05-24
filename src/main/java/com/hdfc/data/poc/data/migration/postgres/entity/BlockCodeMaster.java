package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="CC_TRANSACTION_MASTER")
public class BlockCodeMaster {
    @Id
    @Column(name="BCM_TXN_ID")
    private String bcmTxnId;

    @Column(name="APPID")
    private String appId;

    @Column(name="TXN_DESCRIPTION")
    private String description;

    @Column(name="BCM_ELIGIBILITY")
    private String blockCodeFlag;
}
