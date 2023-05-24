package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "API_TIMEOUT_HISTORY")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ApiTimeoutHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hist_id")
    private Long historyId;

    private String channel;
    @Column(name = "API_HOST_KEY")
    private String apiHostKey;

    @Column(name = "API_END_POINT")
    private String apiEndPoint;

    @Column(name = "API_METHOD")
    private String apiMethod;

    private Integer timeout;

    @Column(name = "MAKER_ID")
    private String makerId;

    @Column(name = "MAKER_DATE")
    private Timestamp makerDate;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "CHECKER_DATE")
    private Timestamp checkerDate;

    @Column(name = "REQ_NO")
    private String reqNo;

}
