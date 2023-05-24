package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "MSTREGBRNMAP")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IpinRegionMaintenance {

    @Id
    @Column(name= "CODHOMEBRN")
    private String branchCode;

    @Column(name= "CODREGION")
    private String region;

    @Column(name= "BRANCH_NAME")
    private String branchName;

    @Column(name="MAKERID")
    private String makerId;

    @Column(name="CHECKERID")
    private String checkerId;

    @Column(name="DATCREATED")
    private Timestamp datCreated;

    @Column(name="DATCHECK")
    private Timestamp checkerDate;

    @Column(name="DATMODIFIED")
    private Timestamp datModified;

    @Column(name= "FLG_MNT_STATUS")
    private String status;

    @Column(name= "FLG_MNT_ACTION")
    private String action;

    @Column(name="MIG_DAT")
    private Timestamp migDate;

    @Column(name="REQ_NO")
    private String reqNo;

}
