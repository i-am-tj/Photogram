package dev.iamtj.photogramemailverificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotogramEmailVerificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotogramEmailVerificationServiceApplication.class, args);
    }

}
