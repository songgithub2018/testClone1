package com.demo.testspringbooteurekaserver8762;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TestSpringbootEurekaServer8762Application {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringbootEurekaServer8762Application.class, args);
    }

}
