package com.hdfc.data.poc.data.migration.oracle.entity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvIgnore;
import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "APPLICATION_GEN_PARAM", schema = "anonymous")
@Entity
@Getter
@Setter
@ToString
public class ApplicationGenParam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @CsvIgnore
    private Long pk;

    @CsvBindByPosition(position = 0)
    @CsvBindByName(column = "PARAM_KEY")
    @Column(name = "PARAM_KEY")
    private String paramKey;

    @CsvBindByPosition(position = 1)
    @CsvBindByName(column = "PARAM_VALUE")
    @Column(name = "PARAM_VALUE")
    private String paramValue;

    @CsvBindByPosition(position = 2)
    @CsvBindByName(column = "SUB_PARAM_KEY")
    @Column(name = "SUB_PARAM_KEY")
    private String subParamKey;

    @CsvBindByPosition(position = 3)
    @CsvBindByName(column = "ACTION")
    @Column(name = "ACTION")
    private String action;

    @CsvBindByPosition(position = 4)
    @CsvBindByName(column = "CACHE_REQUIRED")
    @Column(name = "CACHE_REQUIRED")
    private String cacheRequired;

    @CsvBindByPosition(position = 5)
    @CsvBindByName(column = "CREATED_BY")
    @Column(name = "CREATED_BY")
    private String createdBy;

    @CsvBindByPosition(position = 6)
    @CsvBindByName(column = "CREATED_DT")
    @Column(name = "CREATED_DT")
    private Timestamp createdDate;

    @CsvBindByPosition(position = 7)
    @CsvBindByName(column = "DATA_TYPE")
    @Column(name = "DATA_TYPE")
    private String dataType;

    @CsvBindByPosition(position = 8)
    @CsvBindByName(column = "DISPLAY_SEQ")
    @Column(name = "DISPLAY_SEQ")
    private String displaySeq;

    @CsvBindByPosition(position = 9)
    @CsvBindByName(column = "GENERIC_PARAM")
    @Column(name = "GENERIC_PARAM")
    private String genericParam;


    @CsvBindByPosition(position = 10)
    @CsvBindByName(column = "Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CsvBindByPosition(position = 11)
    @CsvBindByName(column = "MIG_DAT")
    @Column(name = "MIG_DAT")
    private Timestamp migDate;

    @CsvBindByPosition(position = 12)
    @CsvBindByName(column = "MODIFIED_BY")
    @Column(name = "MODIFIED_BY")
    private String modifiedBy;
    @CsvBindByPosition(position = 13)
    @CsvBindByName(column = "MODIFIED_DT")
    @Column(name = "MODIFIED_DT")
    private Timestamp modifiedDate;

    @CsvBindByPosition(position = 14)
    @CsvBindByName(column = "PARAM_DESC")
    @Column(name = "PARAM_DESC")
    private String paramDescription;

    @CsvBindByPosition(position = 15)
    @CsvBindByName(column = "PARAM_TYPE")
    @Column(name = "PARAM_TYPE")
    private String paramType;

    @CsvBindByPosition(position = 16)
    @CsvBindByName(column = "PATTERN")
    @Column(name = "PATTERN")
    private String pattern;

    @CsvBindByPosition(position = 17)
    @CsvBindByName(column = "REQ_NO")
    @Column(name = "REQ_NO")
    private String requestNo;

    @CsvBindByPosition(position = 18)
    @CsvBindByName(column = "STATUS")
    @Column(name = "STATUS")
    private Character status;

    @CsvBindByPosition(position = 19)
    @CsvBindByName(column = "SUB_PARAM_TYPE")
    @Column(name = "SUB_PARAM_TYPE")
    private String subParamType;


    public ApplicationGenParam(String paramDescription, String modifiedBy, Timestamp modifiedDate, String createdBy, Timestamp createdDate, String paramType) {
        this.paramDescription = paramDescription;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.paramType = paramType;
    }
}
