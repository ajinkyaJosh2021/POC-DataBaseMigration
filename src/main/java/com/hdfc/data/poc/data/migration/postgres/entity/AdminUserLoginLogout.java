package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@Table(name = "mst_admin_user_login_logout")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AdminUserLoginLogout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userid")
    private String userId;

    @Column(name = "activity_type")
    private String activityType;

    @Column(name = "activity_time")
    private Timestamp activityTime;
}
