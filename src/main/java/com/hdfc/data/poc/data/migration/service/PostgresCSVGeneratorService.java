package com.hdfc.data.poc.data.migration.service;

import com.hdfc.data.poc.data.migration.configuration.CustomMappingStrategy;
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

        CustomMappingStrategy<ApplicationGenParam> strategy = new CustomMappingStrategy<>();
        strategy.setType(ApplicationGenParam.class);

        Writer writer = null;
        try {
            writer = new FileWriter(fileName);
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer)
                    .withMappingStrategy(strategy)
                    .build();
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

