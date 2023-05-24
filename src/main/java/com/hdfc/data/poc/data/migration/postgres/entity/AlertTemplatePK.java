package com.hdfc.data.poc.data.migration.postgres.entity;

import com.opencsv.bean.CsvBindByPosition;
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
public class AlertTemplatePK implements Serializable {
    private static final long serialVersionUID = -8219317731797822407L;

    @Column(name = "PARENT_TXNID")
    private String parentTxnId;

    @Column(name = "ALERT_CASE")
    private String alertCase;

    @Column(name = "DELIVERYMEDIUM")
    private String delMedium;

    @Override
    public String toString() {
        return parentTxnId + ","+ alertCase + ","+ delMedium ;
    }
}

