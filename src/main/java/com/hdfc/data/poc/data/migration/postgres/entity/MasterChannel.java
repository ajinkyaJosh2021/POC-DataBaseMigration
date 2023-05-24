package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "mst_channel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MasterChannel {

    @Id
    @Column(name = "idchannel")
    private String idChannel;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DAT_CREATED")
    private Timestamp createdDate;
    @Column(name = "DAT_MODIFY")
    private Timestamp modifiedDate;
    @Column(name = "DATMAKE")
    private Timestamp makerDate;
    @Column(name = "DATECHECK")
    private Timestamp checkerDate;
    @Column(name = "CHECKERID")
    private String checkerId;
    @Column(name = "MAKERID")
    private String makerId;
    @Column(name = "REQ_NO")
    private String requestNo;
    @Column(name = "ACTION")
    private String action;
}
