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
public class ErrorDetailsPk implements Serializable {
    private static final long serialVersionUID = 51834041983570818L;
    @Column(name = "TXN_ID")
    private String txnId;

    @Column(name = "CHANNEL_ID")
    private String channelId;

    @Column(name = "ERROR_CODE")
    private String errorCode;
}
