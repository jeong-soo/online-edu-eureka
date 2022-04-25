package dev.jsoo.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlineEduPlatformEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineEduPlatformEurekaApplication.class, args);
    }

}
