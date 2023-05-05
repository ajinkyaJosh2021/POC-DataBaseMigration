package com.hdfc.data.poc.data.migration.service;

import com.hdfc.data.poc.data.migration.oracle.entity.ApplicationGenParam;
import com.hdfc.data.poc.data.migration.oracle.repository.OracleApplicationGenParamRepository;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class OracleCSVGeneratorService {
    private final OracleApplicationGenParamRepository oracleApplicationGenParamRepository;

    private static final String fileName = "C:\\Users\\Asus\\Documents\\csvdata\\oracleData.csv";
    public void writeOracleDataToCSVFile() {
        List<ApplicationGenParam> data = oracleApplicationGenParamRepository.findAll();
        Writer writer = null;
        try {
            writer = new FileWriter(fileName);
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
            beanToCsv.write(data);
            writer.close();
        } catch (IOException e) {
            log.error(e.getMessage());
        } catch (CsvRequiredFieldEmptyException e) {
            log.error(e.getMessage());
        } catch (CsvDataTypeMismatchException e) {
            log.error(e.getMessage());
        }
    }
}
