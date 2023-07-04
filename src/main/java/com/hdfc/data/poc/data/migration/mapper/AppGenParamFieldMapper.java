package com.hdfc.data.poc.data.migration.mapper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppGenParamFieldMapper {

    private static Map<String, String> map;
    private static List<Integer> pubSubColumns = Arrays.asList(1, 2, 3, 4, 14, 17, 16, 18);

    static {

        map = new HashMap<>();
        map.put("PARAM_KEY", "paramKey");
        map.put("SUB_PARAM_KEY", "subParamKey");
        map.put("PARAM_VALUE", "paramValue");
        map.put("ID", "id");
        map.put("PARAM_DESC", "paramDescription");
        map.put("DISPLAY_SEQ", "displaySeq");
        map.put("STATUS", "status");
        map.put("MODIFIED_BY", "modifiedBy");
        map.put("MODIFIED_DT", "modifiedDate");
        map.put("CREATED_BY", "createdBy");
        map.put("CREATED_DT", "createdDate");
        map.put("MIG_DAT", "migDate");
        map.put("REQ_NO", "requestNo");
        map.put("ACTION", "action");
        map.put("PARAM_TYPE", "paramType");
        map.put("GENERIC_PARAM", "genericParam");
        map.put("PATTERN", "pattern");
        map.put("SUB_PARAM_TYPE", "subParamType");
        map.put("DATA_TYPE", "dataType");
        map.put("CACHE_REQUIRED", "cacheRequired");
    }

    private AppGenParamFieldMapper() {
    }

    public static String getEntityFieldName(String csvFieldName) {
        return map.get(csvFieldName.toUpperCase());
    }

    public static List<Integer> getPubSubElements() {

        return pubSubColumns;
    }

}
