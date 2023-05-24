package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MstPosCustType {

    private Long posCustTypeId;

    private String custType;

    private String description;

    private String makerId;

    private String status ;

    private Timestamp makerDate;
    private String checkerId;

    private Timestamp checkerDate;

    private String flgMntAction;

}
