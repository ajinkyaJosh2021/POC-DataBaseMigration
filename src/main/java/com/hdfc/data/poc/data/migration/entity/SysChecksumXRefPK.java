package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysChecksumXRefPK implements Serializable {

    private String systemId;

    private String merchantId;

    public String getConcatedPrimaryKey(){
        return systemId.concat(merchantId);
    }
}
