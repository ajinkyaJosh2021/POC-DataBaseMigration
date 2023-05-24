package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "role_app_channel_map")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleAppChannelMap {

    @Id
    @Embedded
    RoleAppChannelMapPk roleAppChannelMapPk;

    @Column(name = "ISDEFAULT")
    private String isDefault;

    @Column(name = "DAT_CREATED")
    private Timestamp createdDate;

    @Column(name = "DAT_MODIFY")
    private Timestamp modifiedDate;

    @Column(name = "DATMAKE")
    private Timestamp makerDate;

    @Column(name = "DATCHECK")
    private Timestamp checkerDate;

    @Column(name = "MAKERID")
    private String makerId;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "REQ_NO")
    private String requestNumber;

    @Column(name = "ACTION")
    private String action;
}
