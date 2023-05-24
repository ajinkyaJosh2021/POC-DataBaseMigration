package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TxnAppCategoryMappingPK implements Serializable {
    @Column(name = "BB_TXNID")
    private String bbTxnId;

    @Column(name = "APPID")
    private String appId;

    @Column(name = "CATEGORY")
    private String category;
}
