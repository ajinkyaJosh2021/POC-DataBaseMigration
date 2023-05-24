package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "ETHNIC_CSS_MAP")
@NoArgsConstructor
public class EthnicCssMap {

    @Id
    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "ETHNIC_CODE")
    private String ethnicCode;

    @Column(name = "BAND_VALUE")
    private String bandValue;

    @Column(name = "CSS_NAME")
    private String cssName;

    @Column(name = "EMAIL_ID")
    private String emailId;

    @Column(name = "FLGMNTSTATUS")
    private String flgMntStatus;

    @Column(name = "ROLEID")
    private String roleId;

    @Column(name = "DATMODIFY")
    private Timestamp dateModify;

    @Column(name = "DATCHECK")
    private Timestamp checkerDate;

    @Column(name = "TRANSACTIONID")
    private String transactionId;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "DATCREATED")
    private Timestamp dateCreated;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "MIG_DAT")
    private Timestamp migDat;

    @Column(name = "SUPPORT_ID")
    private String supportId;

    @Column(name = "INPUTTER_IDS")
    private String inputterIds;

    @Column(name = "AUTHORIZER_IDS")
    private String authorizerIds;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "FLG_MNT_ACTION")
    private String flgMntAction;

}
