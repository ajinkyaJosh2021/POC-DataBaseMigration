package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ISAC_REQUEST_WORKFLOW")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IsacRequestWorkflow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REQUEST_ID")
    private String requestId;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "ISAC_ID")
    private String isacId;
}
