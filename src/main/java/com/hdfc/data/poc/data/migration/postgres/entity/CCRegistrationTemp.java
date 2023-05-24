package com.hdfc.data.poc.data.migration.postgres.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "CC_REGISTRATION_TEMP")
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
public class CCRegistrationTemp {

    @Id
    @Column(name = "userId")
    private String userId;

    @Column(name = "credit_Card_Number")
    private String creditCardNumber;

    @Column(name = "makerId")
    private String makerId;

    @Column(name = "req_no")
    private String requestNo;

    @Column(name = "maker_date")
    private Timestamp makerDate;

    @Column
    private String action;

}
