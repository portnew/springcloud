package com.zhang.config3344;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * @Author 张宏运
 * @Date  2019-04-17 13:23
 * Config server
 */
@EnableConfigServer
@SpringBootApplication
public class Config3344Application {

    public static void main(String[] args) {
        SpringApplication.run(Config3344Application.class, args);
    }

}
