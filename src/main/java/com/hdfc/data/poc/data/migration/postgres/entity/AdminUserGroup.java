package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@AllArgsConstructor
@Table(name = "mst_admin_user_grp")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AdminUserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String code;

    private String grpName;

    private Long createdDate;

    private Timestamp updatedDate;

}
