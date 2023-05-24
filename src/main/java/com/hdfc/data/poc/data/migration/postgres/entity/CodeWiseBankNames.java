package com.hdfc.data.poc.data.migration.postgres.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "CODEWISEBANKNAMES")
@AllArgsConstructor
@NoArgsConstructor
public class CodeWiseBankNames {
    @Id
    @Column(name = "BANKCODE")
    private String bankCode;

    @Column(name = "BANKNAME")
    private String bankName;

    @Column(name = "FLG_MNT_STATUS")
    private Character flgMntStatus;

    @Column(name = "FLG_MNT_ACTION")
    private Character flgMntAction;

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "MAKERDATE")
    private Timestamp makerDate;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "CHECKERDATE")
    private Timestamp checkerDate;

    @Column(name = "CCARD_IMPS_FLAG")
    private Character cCardImpsFlag;

    @Column(name = "MIG_DATE")
    private Timestamp migDate;

    @JsonIgnore
    @Column(name = "REQ_NO")
    private String reqNo;

    @JsonIgnore
    @Column(name = "DATE_CTREATED")
    private Timestamp createdDate;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, updatable = false, insertable = false, unique = true, columnDefinition = "serial")
    private Long id;
}
