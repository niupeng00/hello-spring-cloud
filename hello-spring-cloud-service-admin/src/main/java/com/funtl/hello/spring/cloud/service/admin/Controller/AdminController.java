package com.funtl.hello.spring.cloud.service.admin.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "Hi")
    public String sayHi(String message){
        return String.format("Hi your message is : %s port : %s",message, port);
    }
}
