package com.funtl.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError") //连不上就返回hiError方法的结果
    public String sayHi(String message) {
        /*return restTemplate.getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message=" + message, String.class);*/
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/Hi?message="+message,String.class);
    }

    public String hiError(String message){
        return String.format("Hi your messages is : %s but request bad",message);
    }
}
