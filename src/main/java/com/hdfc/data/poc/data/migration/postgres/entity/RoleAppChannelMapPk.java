package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoleAppChannelMapPk implements Serializable {

    @Column(name = "idrole")
    private String idRole;

    @Column(name = "idapp")
    private String idApp;

    @Column(name = "idchannel")
    private String idChannel;

    public RoleAppChannelMapPk(String idRole, String idApp) {
        this.idRole = idRole;
        this.idApp = idApp;
    }
}
