package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "role_txn_map_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoleTransactionMapHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "history_id")
    private Integer historyId;

    @Embedded
    private RoleTransactionMapPk roleTransactionMapPk;

    @Column(name = "DAT_CREATED")
    private Timestamp createdDate;

    @Column(name = "DAT_MODIFY")
    private Timestamp modifiedDate;

    @Column(name = "DATMAKE")
    private Timestamp makerDate;

    @Column(name = "DATCHECK")
    private Timestamp checkerDate;

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "REQ_NO")
    private String requestNumber;

    @Column(name = "ACTION")
    private String action;

}
