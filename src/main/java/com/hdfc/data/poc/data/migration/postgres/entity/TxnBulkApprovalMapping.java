package com.hdfc.data.poc.data.migration.postgres.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TXN_BULK_APPROVAL_MAPPING")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TxnBulkApprovalMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "txn_id")
    private String txnId;

    @Column(name = "bulk_approval_flag")
    private String bulkApprovalFlag;
}
