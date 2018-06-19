package com.marcuseisele.springboot_microservices.counterservice.api.client;

import feign.Client;
import feign.hystrix.HystrixFeign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Clients {

    @Bean
    CountClient countClient(Client client) {
        return HystrixFeign.builder()
                .client(client)
                .target(CountClient.class, "http://counterservice", fallback);
    }

    CountClient fallback = () -> "fallback 1337";


}
