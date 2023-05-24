package com.hdfc.data.poc.data.migration.postgres.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "fininstitutemst_dealpro")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FinancialInstitution implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FINANCIAL_INSTITUTION_CODE")
    private Long institutionCode;

    @Column(name = "FINANCIAL_INSTITUTION_NAME")
    private String institutionName;

    @Column(name = "MAKER_ID")
    private String makerId;

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

}
