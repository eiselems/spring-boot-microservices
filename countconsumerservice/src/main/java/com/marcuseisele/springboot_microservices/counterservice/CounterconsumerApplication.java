package com.marcuseisele.springboot_microservices.counterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableDiscoveryClient
@EnableRetry
@EnableFeignClients
public class CounterconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterconsumerApplication.class, args);
	}
}
