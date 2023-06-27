package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "APPLICATION_GEN_PARAM_HISTORY",schema = "hdfc")
public class ApplicationGenParamHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HISTORY_ID")
    private Long id;

    @Column(name = "PARAM_KEY")
    private String paramKey;

    @Column(name = "SUB_PARAM_KEY")
    private String subParamKey;

    @Column(name = "PARAM_VALUE")
    private String paramValue;

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


    public ApplicationGenParamHistory(ApplicationGenParam applicationGenParam, String requestNo){
        this.paramKey = applicationGenParam.applicationGenParamPK.getParamKey();
        this.subParamKey = applicationGenParam.applicationGenParamPK.getSubParamKey();
        this.paramValue = applicationGenParam.applicationGenParamPK.getParamValue();
        this.paramDescription = applicationGenParam.getParamDescription();
        this.modifiedBy = applicationGenParam.getModifiedBy();
        this.modifiedDate = applicationGenParam.getModifiedDate();
        this.createdBy = applicationGenParam.getCreatedBy();
        this.createdDate = applicationGenParam.getCreatedDate();
        this.migDate = applicationGenParam.getMigDate();
        this.paramType = applicationGenParam.getParamType();
        this.requestNo = requestNo;
    }
}
