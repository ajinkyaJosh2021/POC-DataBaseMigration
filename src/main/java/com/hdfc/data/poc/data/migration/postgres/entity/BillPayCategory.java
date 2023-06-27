package com.hdfc.data.poc.data.migration.postgres.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "MST_BILLER_CATEGORY")
public class BillPayCategory {

    @EmbeddedId
    private BillPayCategoryPK billPayCategoryPK;

    @Column(name = "BILL_PAY_CATEGORY_SEQ")
    private Integer billPayCategorySeq;

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
