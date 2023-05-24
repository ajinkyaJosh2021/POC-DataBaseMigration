package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CctxnPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "blockcode")
    private String blockCode;

    @Column(name = "bin")
    private String binNo;

    @Column(name = "logo")
    private String logoNo;

    @Column(name = "idapp")
    private String appId;

    @Column(name = "idtxn")
    private String txnId;

    @Column(name="FLG_MNT_STATUS")
    private String flgMntStatus;
}
