package dev.iamtj.photogramgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotogramGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotogramGatewayApplication.class, args);
    }

}
