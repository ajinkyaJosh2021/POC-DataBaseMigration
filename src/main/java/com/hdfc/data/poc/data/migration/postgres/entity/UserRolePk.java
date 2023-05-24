package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class UserRolePk implements Serializable {

    @Column(name = "CUSTID")
    private String custId;

    @Column(name = "ROLEID")
    private String roleId;

    @Column(name = "IDAPP")
    private String idApp;

}
