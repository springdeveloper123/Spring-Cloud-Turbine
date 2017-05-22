package com.spring.results.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.results")
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableEurekaClient
public class StudentResultsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentResultsServiceApplication.class, args);
    }

}
