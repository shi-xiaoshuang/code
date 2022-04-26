package com.sxs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StaffServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaffServerApplication.class, args);
    }

}
