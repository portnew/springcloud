package com.zhang.providerhystrix8004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author 张宏运
 * @Date  2019-04-15 14:10
 */
@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker
@EnableDiscoveryClient
public class ProviderHystrix8004Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrix8004Application.class, args);
    }

}
