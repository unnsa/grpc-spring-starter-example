package com.unn.fuck.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Michael (yidongnan@gmail.com)
 * @since 2016/11/8
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudGrpcServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGrpcServerApplication.class, args);
    }
}
