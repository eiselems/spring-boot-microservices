package com.marcuseisele.springboot_microservices.counterservice.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "counterservice", fallback = CountFeignClient.CountFeignClientFallback.class)
public interface CountFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "randomslowness")
    String getStores();

    class CountFeignClientFallback implements CountFeignClient {

        public String getStores() {
            return "my awesome fallback 1337";
        }

    }
}
