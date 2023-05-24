package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "DYNAMIC_AUTH_MODEL")
public class AuthenticationEntityMap {

    @EmbeddedId
    private AuthenticationMapPK authenticationMapPK;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "AUTHENTICATION_TYPE")
    private String authenticationType;

    @Column(name = "ENSTAGE_OTP_TYPE")
    private String enstageOtpType;

    @Column(name = "RSA_OTP_TYPE")
    private String rsaOtpType;
}
