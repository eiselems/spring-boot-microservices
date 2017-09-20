package com.marcuseisele.springboot_microservices.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserviceApplication.class, args);
	}
}
