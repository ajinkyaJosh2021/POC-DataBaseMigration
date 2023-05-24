package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Embeddable
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleTransactionMapPk implements Serializable {

    @Column(name = "IDROLE")
    private String idRole;

    @Column(name = "IDTXN")
    private String idTxn;
}
