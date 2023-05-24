package com.hdfc.data.poc.data.migration.postgres.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "VIEW_CHALLAN_HIS")
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ViewChallanHis{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "HISTORYID")
    private Long historyId;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "MERCHANT_CODE")
    private String merchantCode ;

    @Column(name = "URL")
    private String url;

    @Column(name = "ENABLE_STATUS")
    private String enableStatus;

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

    @Column(name = "ACTIONDATE")
    private Timestamp actionDate;
}
