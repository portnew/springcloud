package com.zhang.provider8003;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZHY
 */
@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan("com.zhang.provider8003.mapper")
@SpringBootApplication
public class Provider8003Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider8003Application.class, args);
    }

}
