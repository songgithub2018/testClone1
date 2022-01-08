package com.test.testspringcloudorder8000.feign;

import com.test.testspringcloudorder8000.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface OrderFeignService {

    @RequestMapping(value = "/payment/getPayment/{id}"  )
    public Payment getPayment(@PathVariable Long id);

}
