package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "FUNDS_TRANSFER_PROPERTIES_HIS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FundsTransferPropertiesHis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HISTORY_ID")
    private Long historyId;

    @Column(name = "ID")
    private Long id;

    @Column(name = "MAKER_ID")
    private String makerId;

    @Column(name = "MAKER_DATE")
    private Timestamp makerDate;

    @Column(name = "CHECKER_DATE")
    private Timestamp checkerDate;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "TXN_NAME")
    private String txnName;

    @Column(name = "TXN_ID")
    private String txnId;

    @Column(name = "NARRATIVE_CREDIT")
    private String narrativeCredit;

    @Column(name = "NARRATIVE_DEBIT")
    private String narrativeDebit;

    @Column(name = "FORCE_DEBIT_FLG")
    private String forceDebitFlg;

    @Column(name = "FROM_ACCOUNT_TYPE")
    private String fromAccountType;

    @Column(name = "TO_ACCOUNT_ID")
    private String toAccountId;

    @Column(name = "TO_ACCOUNT_TYPE")
    private String toAccountType;

    @Column(name = "ACTION")
    private String action;

    @Column(name= "STATUS")
    private  String status;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "delete_reason")
    private String deleteReason;
}
