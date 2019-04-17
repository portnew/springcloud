package com.zhang.eurekaserver7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZHY
 * @date 2019/04/13
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7002Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002Application.class, args);
    }

}
