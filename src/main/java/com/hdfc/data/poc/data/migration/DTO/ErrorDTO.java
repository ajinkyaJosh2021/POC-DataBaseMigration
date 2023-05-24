package com.hdfc.data.poc.data.migration.DTO;


public class ErrorDTO {

    private String columnName;
    private String lineFiveValue;
    private String lineSixValue;
    private String errorDescription;

    public ErrorDTO(){}

    public ErrorDTO(String columnName, String lineFiveValue, String lineSixValue) {
        this.columnName = columnName;
        this.lineFiveValue = lineFiveValue;
        this.lineSixValue = lineSixValue;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getLineFiveValue() {
        return lineFiveValue;
    }

    public void setLineFiveValue(String lineFiveValue) {
        this.lineFiveValue = lineFiveValue;
    }

    public String getLineSixValue() {
        return lineSixValue;
    }

    public void setLineSixValue(String lineSixValue) {
        this.lineSixValue = lineSixValue;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
}
