package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleAppChannelMapPk implements Serializable {

    private String idRole;

    private String idApp;

    private String idChannel;

}
