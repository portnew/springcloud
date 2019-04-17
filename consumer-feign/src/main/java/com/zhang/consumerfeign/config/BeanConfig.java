package com.zhang.consumerfeign.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZhangHongyun
 * @date 2019/04/12
 */
    @Configuration
    public class BeanConfig
    {
        /**
         * 使用@LoadBalanced 开启负载均衡
         */
//        @Bean
//        @LoadBalanced
//        public RestTemplate getRestTemplate()
//        {
//            return new RestTemplate();
//        }

        /**
         * 显示指定负载均衡的算法，这里使用随机算法
         *
         */
        @Bean
        public IRule myRule(){
            return new RandomRule();
        }
    }


