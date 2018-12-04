package com.fueng.spring_cloud.registry_center_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //启用eureka server 服务
public class RegistryCenter2Application {

    public static void main(String[] args) {
        SpringApplication.run(RegistryCenter2Application.class, args);
    }
}
