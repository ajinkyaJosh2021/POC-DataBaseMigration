package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Getter
@Setter
public class SysChecksumXRefPK implements Serializable {

    @Column(name = "SYSTEMID")
    private String systemId;

    @Column(name = "MERCHANTID")
    private String merchantId;

    public String getConcatedPrimaryKey(){
        return systemId.concat(merchantId);
    }
}
