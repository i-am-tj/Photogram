package dev.iamtj.photogramdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PhotogramDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotogramDiscoveryServiceApplication.class, args);
    }

}
