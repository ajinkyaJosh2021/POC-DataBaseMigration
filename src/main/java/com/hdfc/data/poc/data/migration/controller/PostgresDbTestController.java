package com.hdfc.data.poc.data.migration.controller;

import com.hdfc.data.poc.data.migration.service.PostgresCSVGeneratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class PostgresDbTestController {
    private final PostgresCSVGeneratorService service;

    @GetMapping("/generate-postgres-db-csv")
    public ResponseEntity generateCSV() {
        service.writePostgresDataToCSVFile("com.hdfc.data.poc.data.migration.postgres.entity");
        return ResponseEntity.ok().body("created");
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/users")
    public ResponseEntity getDummmyUsers() {
        Map<String,String> map = new HashMap<>();
        map.put("ajinkya","a@gmail.com");
        map.put("vijay","v@gmail.com");
        map.put("sai","s@gmail.com");
        return ResponseEntity.ok().body(map);
    }
}

