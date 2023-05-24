package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "CARDS_MASTER_HIST")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CardsMasterHist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hist_id")
    private Long historyId;

    @Column(name = "id")
    private Long id;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "ACTION")
    private String action;

    @Column(name = "BILL_COMP_ID")
    private String billCompId;

    @Column(name = "CARD_BIN")
    private Long bin;

    @Column(name = "CARD_DESCRIPTION")
    private String desc;

    @Column(name = "CARD_FRANCHISE")
    private String franchise;

    @Column(name = "CARD_IMAGE")
    private String cardImage;

    @Column(name = "PUBLIC_WEBSITE_URL")
    private String pws;

    @Column(name = "CONTENT_ID")
    private String contentId;

    @Column(name = "CARD_NICKNAME")
    private String nickName;

    @Column(name = "CARD_NO_END")
    private Long cardNoEnd;

    @Column(name = "CARD_NO_START")
    private Long cardNoStart;

    @Column(name = "CARD_TYPE")
    private String type;

    @Column(name = "CREATED_BY")
    private String checkerId;

    @Column(name = "CREATED_DT")
    private Timestamp checkerDate;

    private String logo;

    @Column(name = "LOGO_STATUS")
    private String logoStatus;

    @Column(name = "MAKE_BY")
    private String makerId;

    @Column(name = "MAKE_DT")
    private Timestamp makerDate;

    @Column(name = "PLASTIC_TYPE")
    private String plasticType;

    @Column(name = "PRODUCT_GROUPING")
    private String prodGroup;

    @Column(name = "SEGMENT")
    private String segment;

    @Column(name = "SERIES")
    private Long series;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "VARIANT")
    private String variant;
}

