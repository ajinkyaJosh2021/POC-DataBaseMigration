package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="BULK_ROLE_UPLOAD_TEMP")
public class BulkRoleUploadTemp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String checkerId;

    private String appId;

    private String customerId;

    private String roleId;

    private Timestamp datCheck;

    private Timestamp datMake;

    private String filename;
    @Column(name="FLG_MNT_ACTION")
    private String flgMntAction;

    @Column(name="FLG_MNT_STATUS")
    private String flgMntStatus;

    private String makerId;

    @Column(name="REQ_NO")
    private String reqNo;

    private String action;

}
