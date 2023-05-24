package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="MSTCUSTTPTLIMIT_TEMP")
public class MstCustTPTLimitTemp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="BULKUPLOAD_FLG")
    private String bulkUploadFlg;

    private String checkerId;

    private String customerId;

    private Timestamp datCheck;

    private Timestamp datMake;

    private String filename;

    @Column(name="FLG_MNT_ACTION")
    private String flgMntAction;

    @Column(name="FLG_MNT_STATUS")
    private String flgMntStatus;

    private String limitAmt;

    private String makerId;

    private String modProcess;

    @Column(name="REQ_NO")
    private String reqNo;

}
