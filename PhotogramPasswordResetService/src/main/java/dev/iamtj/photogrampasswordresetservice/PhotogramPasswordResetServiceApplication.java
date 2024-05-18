package dev.iamtj.photogrampasswordresetservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotogramPasswordResetServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotogramPasswordResetServiceApplication.class, args);
    }

}
