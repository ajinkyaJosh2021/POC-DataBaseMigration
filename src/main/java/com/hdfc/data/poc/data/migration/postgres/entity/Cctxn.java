package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CCTXN")
public class Cctxn implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private CctxnPK id;

    @Column(name = "checkerid")
    private String checkerId;

    @Column(name = "datcheck")
    private Timestamp checkerDate;

    @Column(name = "datcreated")
    private Timestamp datCreated;

    @Column(name = "datmake")
    private Timestamp makerDate;

    @Column(name = "datmodified")
    private Timestamp dateModified;

    @Column(name = "makerid")
    private String makerId;

    @Column(name = "MIG_DAT")
    private Timestamp migDat;

    @Column(name = "mntaction")
    private String mntAction;

    @Column(name = "REQ_NO")
    private String reqNo;

}
