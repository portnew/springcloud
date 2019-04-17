package com.zhang.consumerdept80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConsumerDept80Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept80Application.class, args);
    }

}
