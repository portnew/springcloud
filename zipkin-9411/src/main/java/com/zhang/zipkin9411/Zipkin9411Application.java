package com.zhang.zipkin9411;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @Author 张宏运
 * @Date  2019-04-24 12:32
 */
@EnableEurekaClient
@EnableZipkinServer
@SpringBootApplication
public class Zipkin9411Application {

    public static void main(String[] args) {
        SpringApplication.run(Zipkin9411Application.class, args);
    }

}
