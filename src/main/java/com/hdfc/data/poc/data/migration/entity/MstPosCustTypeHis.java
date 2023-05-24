package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MstPosCustTypeHis {

    private Long id;

    private Long posCustTypeId;

    private String custType;
private String reqNo;

    private String description;

    private String makerId;

    private String status;
    private Timestamp makerDate;

    private String checkerId;

    private Timestamp checkerDate;

    private String flgMntAction;
}
