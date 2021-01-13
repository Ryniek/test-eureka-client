package com.szewczyk.cdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CdTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CdTestApplication.class, args);
    }

}
