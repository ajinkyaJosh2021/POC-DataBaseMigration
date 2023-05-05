package com.hdfc.data.poc.data.migration.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hdfc.data.poc.data.migration.postgres.entity.ApplicationGenParam;
import com.hdfc.data.poc.data.migration.postgres.repository.PostgresApplicationGenParamRepository;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostgresCSVGeneratorService {
    private final PostgresApplicationGenParamRepository postgresApplicationGenParamRepository;

    private static final String fileName = "C:\\Users\\Asus\\Documents\\csvdata\\postgresData.csv";

    public void writePostgresDataToCSVFile() {
        List<ApplicationGenParam> data = postgresApplicationGenParamRepository.findAll();
        ObjectMapper mapper = new ObjectMapper();
        List l = mapper.convertValue(data, new TypeReference<List>() {});

        Writer writer = null;
        try {
            writer = new FileWriter(fileName);
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
            beanToCsv.write(data);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvRequiredFieldEmptyException e) {
            throw new RuntimeException(e);
        } catch (CsvDataTypeMismatchException e) {
            throw new RuntimeException(e);
        }
    }
}

