package com.zhang.consumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 使用Feign
 * @author ZHY
 * @date 2019/04/15
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.zhang.consumerfeign"})
public class ConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApplication.class, args);
    }

}
