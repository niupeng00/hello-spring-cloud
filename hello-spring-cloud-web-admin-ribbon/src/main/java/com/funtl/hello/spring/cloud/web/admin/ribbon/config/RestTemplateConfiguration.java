package com.funtl.hello.spring.cloud.web.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //java配置 类型xxx.xml
public class RestTemplateConfiguration {

    @Bean //xxx.xml中的bean节点
    @LoadBalanced //访问负载均衡服务
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}