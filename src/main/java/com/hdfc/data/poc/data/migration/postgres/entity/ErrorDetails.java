package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "ERROR_DETAILS")
@Data
@NoArgsConstructor
public class ErrorDetails {

    @EmbeddedId
    private ErrorDetailsPk errorDetailsPk;

    @Column(name = "ERROR_TEXT")
    private String errorText;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "CHECKER_DATE")
    private Timestamp checkerDate;

    @Column(name = "MAKER_DATE")
    private Timestamp makerDate;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "MNTACTION")
    private String action;

}
