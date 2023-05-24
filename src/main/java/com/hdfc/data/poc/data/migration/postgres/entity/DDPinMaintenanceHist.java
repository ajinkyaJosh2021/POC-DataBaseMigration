package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "PINCODE_MAPPING_HIST")
public class DDPinMaintenanceHist {
    @Id
    @Column(name = "PINCODE")
    private int pinCode;
    @Column(name = "MIG_DAT")
    private Long migDat;
    @Column(name = "MAKER_ID")
    private String makerId;
    @Column(name = "CHECKER_ID")
    private String checkerId;
    @Column(name = "FILE_NAME")
    private String fileName;
    @Column(name = "DATUPLOAD")
    private Timestamp datMake;
    @Column(name = "DATCHECK")
    private Timestamp datCheck;
    @Column(name = "REQ_NO")
    private String reqNo;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "FLG_MNT_ACTION")
    private String flgMnt;
    @Column(name = "ID")
    private int id;
}
