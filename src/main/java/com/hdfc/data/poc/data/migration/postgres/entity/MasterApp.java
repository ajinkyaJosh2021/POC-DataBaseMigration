package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mst_app")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MasterApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDAPP")
    private String idApp;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "DAT_CREATED")
    private Timestamp dateCreated;

    @Column(name = "DAT_MODIFY")
    private Timestamp dateModify;

    @Column(name = "DAT_CHECK")
    private Timestamp dateCheck;


    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "DAT_MAKE")
    private Timestamp makerDate;

    @Column(name = "ACTION")
    private String action;
}
