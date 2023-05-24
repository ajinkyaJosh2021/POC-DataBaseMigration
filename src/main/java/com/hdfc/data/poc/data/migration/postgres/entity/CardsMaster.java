package com.hdfc.data.poc.data.migration.postgres.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "CARDS_MASTER")
@NoArgsConstructor
@AllArgsConstructor
public class CardsMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CARD_BIN")
    private String bin;

    @Column(name = "CARD_TYPE")
    private String type;

    @Column(name = "CARD_DESCRIPTION")
    private String desc;

    @Column(name = "CARD_NICKNAME")
    private String nickName;

    @Column(name = "CARD_FRANCHISE")
    private String franchise;

    @Column(name = "LOGO")
    private String logo;

    @Column(name = "SEGMENT")
    private String segment;

    @Column(name = "VARIANT")
    private String variant;

    @Column(name = "LOGO_STATUS")
    private String logoStatus;

    @Column(name = "PLASTIC_TYPE")
    private String plasticType;

    @Column(name = "PRODUCT_GROUPING")
    private String prodGroup;

    @Column(name = "BILL_COMP_ID")
    private String billCompId;

    @Column(name = "SERIES")
    private String series;

    @Column(name = "CARD_NO_START")
    private String cardNoStart;

    @Column(name = "CARD_NO_END")
    private String cardNoEnd;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "MAKER_ID")
    private String createdBy;

    @Column(name = "MAKER_DATE")
    private Timestamp makerDate;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "CHECKER_DATE")
    private Timestamp checkerDate;

    @Column(name = "DAT_CREATED")
    private Timestamp createdDate;

    @Column(name = "PUBLIC_WEBSITE_URL")
    private String pws;

    @Column(name = "CARD_IMAGE")
    private String cardImage;

    @Column(name = "CONTENT_ID")
    private String contentId;



}
