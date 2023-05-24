package com.hdfc.data.poc.data.migration.postgres.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Entity
@AllArgsConstructor
@Table(name = "req_workflow")
@NoArgsConstructor
@Getter
@Setter
@TypeDef(name = "json", typeClass = JsonType.class)
public class Workflow {
    //This Entity is for request workflow table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REQ_NO")
    private String requestNo;

    @Column(name = "REQ_TYPE")
    private String requestType;

    @Column(name = "CREATE_DATE")
    private Timestamp createdDate;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "ACTION")
    private String action;

    @Column(name = "REASON_FOR_REJ")
    private String reason;

    @Type(type = "json")
    @Column(name = "DATA", columnDefinition = "jsonb")
    private Map<String, Object> data = new HashMap<>();

    @Type(type = "json")
    @Column(name = "MASTER_DATA", columnDefinition = "jsonb")
    private Map<String, Object> masterData = new HashMap<>();

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "MAKERDATE")
    private Timestamp makerDate;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "CHECKERDATE")
    private Timestamp checkerDate;

    @Column(name = "BULK_UPLDFLG")
    private String bulkUploadFlag ;

    @Column(name = "APPROVE_TXN_ID")
    private String approveTxnId;


}
