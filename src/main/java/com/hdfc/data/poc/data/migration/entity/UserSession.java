package com.hdfc.data.poc.data.migration.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class UserSession implements Serializable {

    private Long id;

    private String uuid;

    private String userId;

    private Timestamp lastActivityTimestamp;
}
