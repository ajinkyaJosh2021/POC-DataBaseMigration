package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRolePk implements Serializable {

    private String custId;

    private String roleId;

    private String idApp;

}
