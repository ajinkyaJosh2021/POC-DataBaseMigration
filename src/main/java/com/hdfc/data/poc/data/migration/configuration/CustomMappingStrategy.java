package com.hdfc.data.poc.data.migration.configuration;

import com.opencsv.bean.BeanField;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class CustomMappingStrategy<T> extends ColumnPositionMappingStrategy<T> {

    @Override
    public String[] generateHeader(T bean) throws CsvRequiredFieldEmptyException {
        final int numColumns = getFieldMap().values().size();
        if (numColumns == -1) {
            return super.generateHeader(bean);
        }

        String[] header = new String[numColumns];
        super.setColumnMapping(header);

        BeanField<T, Integer> beanField;
        for (int i = 0; i < numColumns; i++) {
            beanField = findField(i);
            String columnHeaderName = beanField.getField().getDeclaredAnnotation(CsvBindByName.class).column();
            header[i] = columnHeaderName;
        }
        return header;
    }
}