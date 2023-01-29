package com.spatialt.ST1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class St1Application {

	public static void main(String[] args) {
		SpringApplication.run(St1Application.class, args);
	}

}
