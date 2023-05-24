package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Getter
@Setter
public class ApplicationGenParamPK implements Serializable {

    private static final long serialVersionUID = -8219317731797822407L;

    @Column(name = "PARAM_KEY")
    private String paramKey;

    @Column(name = "SUB_PARAM_KEY")
    private String subParamKey;

    @Column(name = "PARAM_VALUE")
    private String paramValue;

}