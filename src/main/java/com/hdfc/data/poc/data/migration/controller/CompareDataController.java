package com.hdfc.data.poc.data.migration.controller;

import com.hdfc.data.poc.data.migration.Readers.ReadCSVFiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompareDataController {

    @Autowired
    private ReadCSVFiles readCSVFiles;

    @RequestMapping("/compareCSV")
    public void compareCSV(){
        readCSVFiles.compareCSVS();
    }
}
