package org.skyhigh.msnamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsNamingServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsNamingServerApplication.class, args);
    }
}
