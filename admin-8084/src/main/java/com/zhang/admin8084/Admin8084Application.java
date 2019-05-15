package com.zhang.admin8084;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @Author 张宏运
 * @Date  2019-04-24 13:17
 */
@EnableEurekaClient
@EnableAdminServer
@SpringBootApplication
public class Admin8084Application {

    public static void main(String[] args) {
        SpringApplication.run(Admin8084Application.class, args);
    }

}
