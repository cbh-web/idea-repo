package com.hx.shangji.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
public class ShopApplication {

    /*@Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();//相当于httpclient
    }*/
    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class, args);
    }

}
