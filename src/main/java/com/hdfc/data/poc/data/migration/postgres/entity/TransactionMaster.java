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
@Table(name = "MST_IATXN",schema = "hdfc")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TransactionMaster {

    @Id
    @Column(name = "IDTXN")
    private String idTxn;

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

    @Column(name = "MENU")
    private String menu;

    @Column(name = "SUB_MENU")
    private String subMenu;

    @Column(name = "BNK_TXN_ID")
    private String bankTransactionId;

    @Column(name = "APPID")
    private String applicationId;

    @Column(name = "EPIC")
    private String epic;

    @Column(name = "GROUP_ING")
    private String grouping;

    @Column(name = "ACTION")
    private String action;

    @Column(name = "TXN_ORDER")
    private String transactionOrder;

    @Column(name = "PAGE_LINK")
    private String pageLink;

    @Column(name = "TXN_TYPE")
    private String transactionType;

}
