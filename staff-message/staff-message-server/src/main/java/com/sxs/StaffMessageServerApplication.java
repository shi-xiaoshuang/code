package com.sxs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StaffMessageServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaffMessageServerApplication.class, args);
    }

}
