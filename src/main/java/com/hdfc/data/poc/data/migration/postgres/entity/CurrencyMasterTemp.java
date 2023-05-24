package com.hdfc.data.poc.data.migration.postgres.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "CURRENCY_MASTER_TEMP")
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CurrencyMasterTemp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CURRENCY_CODE")
    private String code;

    @Column(name = "CURRENCY_NAME")
    private String name;

    @Column(name = "INR_EQUIVALENT",precision = 4)
    private Double inrEquivalent;

    //need to check on NVarchar data type
    @Column(name = "CURRENCY_SYMBOL", columnDefinition = "VARCHAR(50)")
    private String symbol;

    @Column(name = "PRODUCT_CODE")
    private String productCode;

    @Column(name = "CURR_ALT_CODE")
    private String altCode;

    @Column(name = "MAKER_ID")
    private String makerId;

    @Column(name = "CHECKER_ID")
    private String checkerId;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "FLG_MNT_ACTION")
    private String flgMntAction;

    @Column(name = "CHECKER_DATE")
    private Timestamp checkerDate;

    @Column(name = "MAKER_DATE")
    private Timestamp makerDate;

    @Column(name = "FCNR_FLAG")
    private String fcnrFlag;

    @Column(name = "FCURR_FLAG")
    private String fcurrFlag;

    @Column(name = "FOREX_FLAG")
    private String forexFlag;

    @Column(name = "REQ_NO")
    private String reqNo;

    @Column(name = "DAT_CREATED")
    private Timestamp dateCreate;

}
