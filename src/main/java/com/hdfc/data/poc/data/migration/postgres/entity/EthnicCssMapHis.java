package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "ETHNIC_CSS_MAP_HIS")
public class EthnicCssMapHis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="WORK_FLOW_REQ_NO")
    private String workFlowReqNo;

    @Column(name="REQ_NO")
    private String reqNo;

    @Column(name="FLG_MNT_ACTION")
    private String flgMntAction;

    @Column(name="ETHNIC_CODE")
    private String ethnicCode;

    @Column(name="BAND_VALUE")
    private String bandValue;

    @Column(name="CSS_NAME")
    private String cssName;

    @Column(name="EMAIL_ID")
    private String emailId;

    @Column(name="FLGMNTSTATUS")
    private String flgMntStatus;

    @Column(name="ROLEID")
    private String roleId;

    @Column(name="DATMODIFY")
    private Timestamp dateModify;

    @Column(name="DATCHECK")
    private Timestamp checkerDate;

    @Column(name="CHECKERID")
    private String checkerId;

    @Column(name="DATCREATED")
    private Timestamp dateCreated;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="MAKERID")
    private String makerId;

    @Column(name="MIG_DAT")
    private Timestamp migDat;

    @Column(name="SUPPORT_ID")
    private String supportId;

    @Column(name="INPUTTER_IDS")
    private String inputterIds;

    @Column(name="AUTHORIZER_IDS")
    private String authorizerIds;

    @Column(name="STATUS")
    private String status;

    @Column(name="TRANSACTIONID")
    private String transactionId;

}
