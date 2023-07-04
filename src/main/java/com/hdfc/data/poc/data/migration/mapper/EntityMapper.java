package com.hdfc.data.poc.data.migration.mapper;

import java.util.HashMap;
import java.util.Map;

public class EntityMapper {

    private static Map<String, String> map;

    static {

        map = new HashMap<>();
        map.put("application_gen_param", "ApplicationGenParam");
    }

    private EntityMapper() {
    }

    public static String getEntityNameFromCsvName(String fileName) {

        return map.get(fileName);
    }
}
