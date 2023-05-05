package com.hdfc.data.poc.data.migration.entity;

import java.io.Serializable;

public class ApplicationGenParamPK implements Serializable {

    private static final long serialVersionUID = -8219317731797822407L;

    //@Column(name = "PARAM_KEY")
    private String paramKey;

    //@Column(name = "SUB_PARAM_KEY")
    private String subParamKey;

    //@Column(name = "PARAM_VALUE")
    private String paramValue;

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public String getSubParamKey() {
        return subParamKey;
    }

    public void setSubParamKey(String subParamKey) {
        this.subParamKey = subParamKey;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }
}
