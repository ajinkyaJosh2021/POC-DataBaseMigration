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
@Table(name = "PINCODE_MAPPING")
public class DDPinMaintenance {

    @Id
    @Column(name = "PINCODE")
    private int pinCode;
    @Column(name = "MIG_DAT")
    private Timestamp migDat;
    @Column(name = "MAKER_ID")
    private String makerId;
    @Column(name = "CHECKER_ID")
    private String checkerId;
    @Column(name = "DATUPLOAD")
    private Timestamp makerDate;
    @Column(name = "DATCHECK")
    private Timestamp checkerDate;
    @Column(name = "REQ_NO")
    private String reqNo;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "FLG_MNT_ACTION")
    private String flgMnt;

}
