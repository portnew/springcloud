package com.zhang.consumerhystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
/**
 * @Author 张宏运
 * @Date  2019-04-15 16:09
 * 使用HystrixDashboard对服务进行监控
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashboardApplication.class, args);
    }

}
