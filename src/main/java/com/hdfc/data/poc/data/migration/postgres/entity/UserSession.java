package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user_session")
public class UserSession implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uuid;

    @Column(name = "user_id", unique = true)
    private String userId;

    @Column(name = "last_activity_timestamp")
    private Timestamp lastActivityTimestamp;

    public UserSession(String userId, String uuid, Timestamp lastActivityTimestamp) {
        this.userId = userId;
        this.uuid = uuid;
        this.lastActivityTimestamp = lastActivityTimestamp;
    }
}
