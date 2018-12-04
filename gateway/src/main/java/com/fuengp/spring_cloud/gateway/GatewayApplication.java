package com.fuengp.spring_cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient //网关也算客户端，所以需要作为eureka的客户端
@EnableZuulProxy //启用zuul路由（代理）
//zuul路由的访问规则是： http://host:prot/service-id/xxx
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
