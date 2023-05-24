package com.hdfc.data.poc.data.migration.postgres.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "fininstitutemst_dealpro_his")
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class FinancialInstitutionHis implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HISTORY_ID")
    private Long id;

    //    @Id
    @Column(name = "FINANCIAL_INSTITUTION_CODE")
    private Long institutionCode;

    //    @Id
    @Column(name = "FINANCIAL_INSTITUTION_NAME")
    private String institutionName;

    @Column(name = "MAKER_ID")
    private String makerId;

    //    @Id
    @Column(name = "DATCHECK")
    private Timestamp checkerdate;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "DATMAKE")
    private Timestamp makerdate;

    @Column(name = "FLG_MNT_ACTION")
    private String flgMntAction;

    @Column(name = "FLG_MNT_STATUS")
    private String flgMntStatus;

    @Column(name = "DAT_CREATED")
    private Timestamp datCreated;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "DELETE_REASON")
    private String reasonForDeletion;

}
