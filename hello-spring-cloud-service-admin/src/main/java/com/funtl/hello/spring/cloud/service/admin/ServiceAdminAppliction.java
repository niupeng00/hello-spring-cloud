package com.funtl.hello.spring.cloud.service.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //客户端
public class ServiceAdminAppliction {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminAppliction.class,args);
    }
}
