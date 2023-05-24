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
@Table(name = "MST_BILLER_CATEGORY_HISTORY")
public class BillPayCategoryHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "BILL_PAY_CATEGORY")
    private String billerCategory;

    @Column(name = "PARENT_CATEGORY")
    private String parentCategory;

    @Column(name = "BILL_PAY_CATEGORY_SEQ")
    private int billPayCategorySeq;

    @Column(name = "ICON_URL_NB")
    private String iconUrlNb;

    @Column(name = "ICON_URL_MB")
    private String iconUrlMb;

    @Column(name = "BILLER_BADGE")
    private String badge;

    @Column(name = "MAKER_ID")
    private String makerId;

    @Column(name = "DATMAKE")
    private Timestamp makerDate;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "DATCHECK")
    private Timestamp checkerDate;

    @Column(name = "DATMODIFIED")
    private Timestamp dateModified;

}
