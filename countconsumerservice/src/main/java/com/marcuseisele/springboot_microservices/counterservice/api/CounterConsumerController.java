package com.marcuseisele.springboot_microservices.counterservice.api;


import com.marcuseisele.springboot_microservices.counterservice.api.client.CountClient;
import com.marcuseisele.springboot_microservices.counterservice.api.client.CountFeignClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class CounterConsumerController {

    private final CountClient countClient;
    private final CountFeignClient countFeignClient;

    CounterConsumerController(CountClient countClient, CountFeignClient countFeignClient) {
        this.countClient = countClient;
        this.countFeignClient = countFeignClient;
    }

    @GetMapping(path = "/decoratedCount")
    public String getDecoratedCount() {
        return "decorated: " + countClient.getStores();
    }

    @GetMapping(path = "/decoratedCountFeignClient")
    public String getDecoratedCountFeign() {
        return "fclient: " + countFeignClient.getStores();
    }
}
