package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class FundsTransferProperties {


        private Long id;
        private String txnName;

        private String txnId;

        private String narrativeCredit;

        private String narrativeDebit;

        private String forceDebitFlg;

        private String fromAccountType;

        private String toAccountId;

        private String toAccountType;

        private String action;
        private String makerId;

        private Timestamp makerDate;

        private Timestamp checkerDate;

        private String checkerId;

        private  String status;

}
