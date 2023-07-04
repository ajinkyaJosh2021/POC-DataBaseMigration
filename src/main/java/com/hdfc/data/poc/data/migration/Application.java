package com.hdfc.data.poc.data.migration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.sql.Timestamp;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hdfc.messaging"})
public class Application {

	public static void main(String[] args) {
		System.out.println(new Timestamp(System.currentTimeMillis()).toString());
		SpringApplication.run(Application.class, args);
	}

}
