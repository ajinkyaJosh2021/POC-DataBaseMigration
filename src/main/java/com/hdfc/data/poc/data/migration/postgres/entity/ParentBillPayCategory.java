package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "MST_PARENT_CATEGORY")
public class ParentBillPayCategory {

    @Id
    @Column(name = "PARENT_CATEGORY")
    private String parentCategory;

    @Column(name = "PARENT_CATEGORY_SEQ")
    private int parentCategorySeq;

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

    @Column(name = "REQ_NO")
    private String reqNo;
}
