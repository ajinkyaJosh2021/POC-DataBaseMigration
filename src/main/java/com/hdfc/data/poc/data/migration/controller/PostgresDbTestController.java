package com.hdfc.data.poc.data.migration.controller;

import com.hdfc.data.poc.data.migration.service.PostgresCSVGeneratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostgresDbTestController {
    private final PostgresCSVGeneratorService service;

    @GetMapping("/generate-postgres-db-csv")
    public ResponseEntity generateCSV() {
        service.writePostgresDataToCSVFile();
        return ResponseEntity.ok().body("created");
    }
}

