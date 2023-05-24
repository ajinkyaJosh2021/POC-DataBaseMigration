package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "UAM_DEPT_HISTORY")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DepartmentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HISTORY_ID")
    private Long id;

    @Column(name = "DEPT_CODE")
    private Long code;

    @Column(name = "DEPT_NAME")
    private String name;

    @Column(name = "FLG_MNT_STATUS")
    private Character flagMaintenanceStatus;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "DATCREATED")
    private Timestamp dateCreated;

    @Column(name = "DATCHECK")
    private Timestamp dateCheck;

    @Column(name = "MIG_DAT")
    private Timestamp migDate;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "MAKER_DATE")
    private Timestamp makerDate;

    @Column(name = "ACTION")
    private String action;
}
