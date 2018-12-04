package com.fuengp.spring_cloud.client_8082.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String appName ;

    @GetMapping("/clientMsg")
    public String clientMsg(){
        return "appName => " + appName + " port => " + port ;
    }
}
