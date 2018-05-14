# spring-boot-microservices

This repository contains the coding part of 'Microservices with Mo'.
A tutorial series about creating an microservice architecture with Spring Boot.

Here are the links to all parts of the series:
* [Intro](https://medium.com/@marcus.eisele/implementing-a-microservice-architecture-with-spring-boot-intro-cdb6ad16806c "Implementing a microservice architecture with Spring Boot — Intro")
* [Part 1: Setting up docker](https://medium.com/@marcus.eisele/implementing-a-microservice-architecture-with-spring-boot-part-one-the-environment-cbc032473ab8 "Setting up docker")
* [Part 2: The architecture](https://medium.com/@marcus.eisele/microservices-with-mo-part-two-the-architecture-3845b5228ddb "Microservices with Mo - Part Two: The architecture")
* [Part 3: The counter microservice](https://medium.com/@marcus.eisele/microservices-with-mo-part-three-the-counter-microservice-5fa34af2dcdc "Microservices with Mo — Part Three: The Counter Microservice")
* [Part 4: The configuration microservice](https://medium.com/@marcus.eisele/microservices-with-mo-part-four-the-configuration-service-7d9a5b1b4f72 "Microservices with Mo — Part Four: The Configuration Service")
* [Part 5: The configuration microservice](https://medium.com/@marcus.eisele/microservices-with-mo-part-five-the-registry-service-netflix-eureka-96f0de083252 "Microservices with Mo — Part Five: The Registry Service (Netflix Eureka)")


The architecture consists / will consist of following services:
* counterservice
* configservice
* servicediscovery
* adminservice
* gatewayservice

## How to run

```
git clone https://github.com/eiselems/spring-boot-microservices.git && cd spring-boot-microservices
mvn clean package -DskipTests && docker-compose up --build
```

Access http://localhost:9999/api/cs/count and refresh a few times to see the counter increase.
You also can access the counterservice itself directly at http://localhost:8080/count.