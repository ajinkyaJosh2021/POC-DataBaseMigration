package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "VISAMT_TXN")
@Data
@NoArgsConstructor
public class VisaAmtTxn {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;
    @Column( name = "refNo")
    private String refNo;
    @Column( name = "senderName")
    private String senderName;
    @Column( name = "acctNo")
    private String acctNo;
    @Column( name = "description")
    private String description;
    @Column( name = "recvName")
    private String recvName;
    @Column( name = "visaCardNo")
    private String visaCardNo;
    @Column( name = "datTxn")
    private Timestamp datTxn;
    @Column( name = "amount")
    private Long amount;
    @Column( name = "errorCode")
    private Long errorCode;
    @Column( name = "errorDesc")
    private String errorDesc;
}

