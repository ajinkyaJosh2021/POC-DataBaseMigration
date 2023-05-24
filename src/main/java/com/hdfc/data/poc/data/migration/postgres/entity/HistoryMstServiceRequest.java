package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "MSTSERVICEREQUEST_HISTORY")
public class HistoryMstServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column( name = "IDSERVICE")
    private String idService;
    @Column( name = "DESCRIPTION")
    private String description;
    @Column( name = "FLG_RSA_ENABLED")
    private String flgRSAEnabled;
    @Column( name = "FLG_RSA_REQD")
    private String fldRSAReqd;
    @Column( name = "SUCCESS_URL")
    private String successURL;
    @Column( name = "FAILURE_URL")
    private String failureURL;
    @Column( name = "REDIRECT_MODE")
    private String redirectMode;
    @Column( name = "IDMAKER")
    private String makerId;
    @Column( name = "DATMAKE")
    private Timestamp makerDate;
    @Column( name = "IDCHECKER")
    private String checkerId;
    @Column( name = "DATCHECK")
    private Timestamp checkerDate;
    @Column( name = "FLG_STATUS")
    private String flgStatus;
    @Column(name="MASTERKEY")
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    private String masterKey;
    @Column( name = "MIG_DAT")
    private Timestamp	migDat;
    @Column( name = "REQ_NO")
    private String reqNo;
    @Column( name = "FLG_MNT_ACTION")
    private String flgMntAction;

}
