package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@Table(name = "mst_role")
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MasterRole {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDROLE")
    private String idRole;

    @Column(name = "app_id")
    private String appId;

    @Column(name = "DAT_CREATED")
    private Timestamp createdDate;
    @Column(name = "DAT_MODIFY")
    private Timestamp modifiedDate;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "DATMAKE")
    private Timestamp makerDate;
    @Column(name = "DATECHECK")
    private Timestamp checkerDate;
    @Column(name = "CHECKERID")
    private String checkerId;
    @Column(name = "MAKERID")
    private String makerId;
    @Column(name = "REQ_NO")
    private String requestNo;

    @Column(name = "ROLE_STATUS")
    private String status;

    @Column(name = "ROLE_SUB_TYPE")
    private String roleSubType;
    @Column(name = "ACTION")
    private String action;
    @Column(name = "USERGRP")
    private String userGroup;

    @Column(name = "AUTHORITY")
    private String authority;


}
