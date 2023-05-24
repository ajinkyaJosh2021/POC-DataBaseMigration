package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USER_ROLE_HISTORY")
public class UserRoleHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HISTORY_ID")
    private Long id;

    @Column(name = "CUSTID")
    private String custId;

    @Column(name = "ROLEID")
    private String roleId;

    @Column(name = "IDAPP")
    private String idApp;

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "DAT_MAKE")
    private Timestamp makerDate;

    @Column(name = "DAT_CHECK")
    private Timestamp checkerDate;

    @Column(name = "MIG_DATA")
    private String migData;

    @Column(name = "REQ_NO")
    private String requestNo;

    @Column(name = "DAT_CREATED")
    private Timestamp createdDate;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "ACTION")
    private String action;

    @Column(name = "Hs_CREATED_TIME")
    private Timestamp hsCreatedTime;

}
