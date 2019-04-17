package com.zhang.provider8002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZHY
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.zhang.provider8002.mapper")
public class Provider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider8002Application.class, args);
    }

}
