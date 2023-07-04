package com.hdfc.data.poc.data.migration.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hdfc.data.poc.data.migration.postgres.entity.ApplicationGenParam;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppGenMaintenanceDTO {

    private String paramKey;

    private String subParamKey;

    private String paramValue;

    private String description;

    private String paramType;

    private String paramPattern;

    private String subParamType;

    private String makerDate;

    private String makerId;

    private String checkerId;

    private String checkerDate;

    private String dateOfMaintenance;

    private String paramDataType;

    private String reqNo;

    private String oldParamValue;

    private AppGenMaintenanceDTO oldDataForModificationPubSub;

    public AppGenMaintenanceDTO(String paramKey, String subParamKey, String paramValue, String description, String paramType, String subParamType, String paramPattern, String paramDataType) {
        this.paramKey = paramKey;
        this.subParamKey = subParamKey;
        this.paramValue = paramValue;
        this.description = description;
        this.paramPattern = paramPattern;
        this.paramType = paramType;
        this.subParamType = subParamType;
        this.paramDataType = paramDataType;
    }
}
