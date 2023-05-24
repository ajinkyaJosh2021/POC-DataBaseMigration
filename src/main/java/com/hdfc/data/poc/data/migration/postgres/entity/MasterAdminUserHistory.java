package com.hdfc.data.poc.data.migration.postgres.entity;


import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@Table(name = "mst_admin_user_history")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MasterAdminUserHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HISTORY_ID")
    private Long id;
    @Column(name = "EMP_CODE")
    private String empCode;
    @Column(name = "DEPT_CODE")
    private Integer deptCode;
    @Column(name = "USER_GROUP")
    private String userGroup;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "BRANCHCODE")
    private String branchCode;
    @Column(name = "BRANCH_NAME")
    private String branchName;
    @Column(name = "USER_ORG")
    private String userOrg;
    @Column(name = "EXPIRY_DATE")
    private Timestamp expiryDate;
    @Column(name = "CREATION_DATE")
    private Timestamp creationDate;
    @Column(name = "LAST_SUCC_LOGIN_DATE")
    private Timestamp lastSuccessLoginDate;
    @Column(name = "LAST_LOGIN_FAILED_DATE")
    private Timestamp lastFailedLoginDate;


    @Column(name = "ACTIVE_FLG")
    private String activeFlag;
    @Column(name = "LOCK_FLG")
    private Character lockFlag;
    @Column(name = "MAKER_ID")
    private String makerId;
    @Column(name = "CHECKER_ID")
    private String checkerId;
    @Column(name = "DATMAKE")
    private Timestamp dateMaker;
    @Column(name = "DATCHECK")
    private Timestamp dateChecker;
    @Column(name = "MIG_DAT")
    private Timestamp migDate;
    @Column(name = "ACTION")
    private String action;
    @Column(name = "REQUEST_ID")
    private String requestId;
    @Column(name = "FORCED_LOCK_FLG")
    private Character forcedLockFlag;
    @Column(name = "LOCK_COUNTER")
    private Integer lockCounter = 0;

}
