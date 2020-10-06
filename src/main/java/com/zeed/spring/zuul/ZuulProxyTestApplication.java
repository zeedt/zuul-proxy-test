package com.zeed.spring.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulProxyTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulProxyTestApplication.class, args);
    }

}
