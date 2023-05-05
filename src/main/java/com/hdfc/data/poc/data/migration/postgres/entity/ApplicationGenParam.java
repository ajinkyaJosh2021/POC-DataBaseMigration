package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "APPLICATION_GEN_PARAM",schema = "hdfc")
@Entity
@Getter
@Setter
@ToString
public class ApplicationGenParam {

    @Id
    Long applicationGenParamPK;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "PARAM_DESC")
    private String paramDescription;

    @Column(name = "DISPLAY_SEQ")
    private String displaySeq;

    @Column(name = "STATUS")
    private Character status;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    @Column(name = "MODIFIED_DT")
    private Timestamp modifiedDate;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "CREATED_DT")
    private Timestamp createdDate;

    @Column(name = "MIG_DAT")
    private Timestamp migDate;

    @Column(name = "REQ_NO")
    private String requestNo;

    @Column(name = "ACTION")
    private String action;

    @Column(name = "PARAM_TYPE")
    private String paramType;

    @Column(name = "GENERIC_PARAM")
    private String genericParam;

    @Column(name = "PATTERN")
    private String pattern;

    @Column(name = "SUB_PARAM_TYPE")
    private String subParamType;

    @Column(name = "DATA_TYPE")
    private String dataType;

    @Column(name = "CACHE_REQUIRED")
    private String cacheRequired;


    public ApplicationGenParam(Long applicationGenParamPK, String paramDescription, String modifiedBy, Timestamp modifiedDate, String createdBy, Timestamp createdDate, String paramType) {
        this.applicationGenParamPK = applicationGenParamPK;
        this.paramDescription = paramDescription;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.paramType = paramType;
    }
}
