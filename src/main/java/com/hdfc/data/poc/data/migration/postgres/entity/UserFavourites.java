package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_favourites")
@Data
@NoArgsConstructor
public class UserFavourites {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "txn_id")
    private String txnId;

    @Column(name = "active")
    private Boolean active;

    public UserFavourites(String userId, String txnId, Boolean active) {
        this.userId = userId;
        this.txnId = txnId;
        this.active = active;
    }
}
