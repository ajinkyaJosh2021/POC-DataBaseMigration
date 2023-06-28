package com.hdfc.data.poc.data.migration.controller;

import com.hdfc.data.poc.data.migration.Readers.ReadCSVFiles;
import com.hdfc.data.poc.data.migration.service.InsertInEntityFromCSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompareDataController {

    @Autowired
    private ReadCSVFiles readCSVFiles;

    @Autowired
    private InsertInEntityFromCSV insertInEntityFromCSV;

    @RequestMapping("/compareCSV")
    public String compareCSV(){

        readCSVFiles.compareCSVS();
        return "Comparission Completed";
    }

    @RequestMapping("/insert")
    public String insertRecords(){

        insertInEntityFromCSV.insertIntoEntityFromCSV();
        return "Insertion Completed";
    }
}
