package com.marcuseisele.springboot_microservices.counterservice.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {

    private static long count = 0L;

    @GetMapping(path = "/count")
    public long getCount(){
        return count++;
    }
}
