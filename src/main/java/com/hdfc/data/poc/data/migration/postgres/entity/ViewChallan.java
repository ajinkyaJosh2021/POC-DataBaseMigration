package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "VIEW_CHALLAN")
@NoArgsConstructor
public class ViewChallan {

    @Id
    @Column(name = "MERCHANT_CODE")
    private String merchantCode;

    @Column(name = "URL")
    private String url;

    @Column(name = "ENABLE_STATUS")
    private String enableStatus;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "MAKER_ID")
    private String makerId;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DATMAKE")
    private Timestamp makerDate;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "DATCHECK")
    private Timestamp checkerDate;

    @Column(name = "FLG_MNT_ACTION")
    private String flgMntAction;

}
