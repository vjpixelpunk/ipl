package com.example.iplstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class IplStatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplStatsApplication.class, args);
	}

}
