package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mst_force_lock_reason_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MasterForceLockReasonHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HISTORY_ID")
    private Long id;

    @Column(name = "REASON_ID")
    private Long reasonId;

    @Column(name = "REASON_TYPE")
    private String reasonType;

    @Column(name = "REASON")
    private String reason;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "MAKER_ID")
    private String makerId;

    @Column(name = "CREATED_DATE")
    private Timestamp createdDate;

    @Column(name = "CHECKER_DATE")
    private Timestamp checkerDate;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "MAKER_DATE")
    private Timestamp makerDate;

}
