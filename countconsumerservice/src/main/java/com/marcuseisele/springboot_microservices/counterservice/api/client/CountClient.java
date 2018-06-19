package com.marcuseisele.springboot_microservices.counterservice.api.client;

import feign.RequestLine;

public interface CountClient {

    @RequestLine("GET /randomslowness")
    String getStores();

}
