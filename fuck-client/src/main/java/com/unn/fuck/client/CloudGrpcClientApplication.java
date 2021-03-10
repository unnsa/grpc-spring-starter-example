package com.unn.fuck.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudGrpcClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGrpcClientApplication.class, args);
    }

}
