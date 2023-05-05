package com.hdfc.data.poc.data.migration;

import com.hdfc.data.poc.data.migration.Readers.ReadCSVFiles;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		ReadCSVFiles readCSVFiles = new ReadCSVFiles();
		readCSVFiles.compareCSVS();
	}

}
