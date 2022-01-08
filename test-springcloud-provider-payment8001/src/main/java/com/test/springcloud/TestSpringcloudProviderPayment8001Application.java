package com.test.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestSpringcloudProviderPayment8001Application {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringcloudProviderPayment8001Application.class, args);
    }

}
