package com.my.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ComMyEurekaclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComMyEurekaclientApplication.class, args);
    }
}
