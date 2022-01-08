package com.test.testspringcloudorder8000.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MetaController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/testMeta")
    public void testMeta (){
        List<ServiceInstance> list=discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance serviceInstance:
            list ) {
            System.out.println(serviceInstance);
        }
    }
}
