package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "IB_MERCH_REDIRECT_HIS")
public class MerchantRedirectionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "merchant_code")
    private String merchantCode;

    @Column(name = "merch_path")
    private String merchantPath;

    @Column(name = "makerId")
    private String makerId;

    @Column(name = "checkerId")
    private String checkerId;

    @Column(name = "dat_mnt_maker")
    private Timestamp makerDate;

    @Column(name = "dat_mnt_checker")
    private Timestamp checkerDate;

    @Column(name = "dat_created")
    private Timestamp createdDate;

    @Column(name = "mig_dat")
    private Timestamp migrationDate;

    @Column(name = "req_no")
    private String requestNo;

    @Column(name = "flg_mnt_action")
    private String action;

    @Column(name = "status")
    private String status;

    @Column(name = "redirect")
    private String redirect;

}
