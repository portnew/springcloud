package com.zhang.provider8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author
 */
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan(basePackages = "com.zhang.provider8001.mapper")
@SpringBootApplication
public class Provider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider8001Application.class, args);
    }

}
