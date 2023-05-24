package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "VPCC_CATEGORY_MASTER")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryMaster {

    @EmbeddedId
    private CategoryMasterPK categoryMasterPK;

    @Column(name = "SL_NO")
    private String slNum;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "MODIFIED_DATE")
    private Timestamp modifiedDate;

    @Column(name = "CREATED_DT")
    private Timestamp createdDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "CHECKERID")
    private String checkerId;

    @Column(name = "CHECKERDATE")
    private Timestamp checkerDate;

}