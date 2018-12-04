package com.fuengp.spring_cloud.registry_center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 1.pom文件引入eureka-server
 * 2.打开application配置文件配置相关信息
 * 3.在此入口类增加@EnableEurekaServer ,启用Eureka服务器
 */
@SpringBootApplication
@EnableEurekaServer //启用eureka server服务
public class RegistryCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryCenterApplication.class, args);
    }
}
