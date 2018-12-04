package com.fuengp.spring_cloud.client_8082;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Client8082Application {

    public static void main(String[] args) {
        SpringApplication.run(Client8082Application.class, args);
    }
}
