package com.hdfc.data.poc.data.migration.DTO;

import java.util.List;
import java.util.Map;

public class ReportReponseDTO {

    private String tableName;
    private String lineFiveRowCount;
    private String lineSixRowCount;
    private Map<String,List<String>> dataIssues;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getLineFiveRowCount() {
        return lineFiveRowCount;
    }

    public void setLineFiveRowCount(String lineFiveRowCount) {
        this.lineFiveRowCount = lineFiveRowCount;
    }

    public String getLineSixRowCount() {
        return lineSixRowCount;
    }

    public void setLineSixRowCount(String lineSixRowCount) {
        this.lineSixRowCount = lineSixRowCount;
    }

    public Map<String, List<String>> getDataIssues() {
        return dataIssues;
    }

    public void setDataIssues(Map<String, List<String>> dataIssues) {
        this.dataIssues = dataIssues;
    }
}
