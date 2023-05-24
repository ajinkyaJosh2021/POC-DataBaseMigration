package com.hdfc.data.poc.data.migration.postgres.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "SYSCHECKSUMXREFTEMP")
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
public class SysChecksumRefTemp implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private SysChecksumXRefPK sysChecksumXRefPK;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "DATCHECK")
    private Timestamp dateCheck;

    @Column(name = "DATCREATED")
    private Timestamp dateCreated;

    @Column(name = "DATMAKE")
    private Timestamp dateMake;

    @Column(name = "FLG_MNT_ACTION")
    private String flgMntAction;

    @Column(name = "\"KEY\"") //key is the reserved keyword
    private String key;

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "MIG_DAT")
    private Timestamp migDate;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "UPLOAD_ACTION")
    private String uploadAction;


    private String status;

}

