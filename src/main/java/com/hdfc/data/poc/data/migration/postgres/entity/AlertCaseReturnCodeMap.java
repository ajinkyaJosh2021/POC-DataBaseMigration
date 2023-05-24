package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ALERTCASE_RETURNCODE_MAP")
@Data
public class AlertCaseReturnCodeMap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transaction;
    private String alertCode;
    private String returnCode;
}
