package com.marcuseisele.springboot_microservices.counterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CounterserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterserviceApplication.class, args);
	}
}
