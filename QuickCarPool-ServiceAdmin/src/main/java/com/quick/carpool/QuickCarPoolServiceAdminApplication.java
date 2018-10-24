package com.quick.carpool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@Configuration
@SpringBootApplication
@EnableAutoConfiguration
public class QuickCarPoolServiceAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickCarPoolServiceAdminApplication.class, args);
	}


}