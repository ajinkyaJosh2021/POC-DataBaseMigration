package com.hdfc.data.poc.data.migration.controller;

import com.hdfc.data.poc.data.migration.service.OracleCSVGeneratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OracleDbTestController {
    private final OracleCSVGeneratorService service;

    @GetMapping("/generate-oracle-db-csv")
    public ResponseEntity generateCSV() {
        service.writeOracleDataToCSVFile();
        return ResponseEntity.ok().body("created");
    }
}
