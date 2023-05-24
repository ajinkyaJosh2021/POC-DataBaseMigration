package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TXN_BLACKOUT_HISTORY")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BlackoutHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "txn_id")
    private String txnId;

    @Column(name = "message")
    private String message;

    @Column(name = "epic")
    private String epic;

    @Column(name = "start_time")
    private Timestamp startTime;

    @Column(name = "end_time")
    private Timestamp endTime;

    @Column(name = "status")
    private String status;

    @Column(name = "idapp")
    private String appId;

    @Column(name = "req_date")
    private Timestamp reqDate;

    @Column(name = "req_id")
    private String reqId;

    @Column(name = "channel_id")
    private String channelId;

    @Column(name = "maker_id")
    private String makerId;

}
