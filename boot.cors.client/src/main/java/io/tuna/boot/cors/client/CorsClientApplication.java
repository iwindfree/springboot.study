package io.tuna.boot.cors.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CorsClientApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CorsClientApplication.class);
        app.run(args);
    }
}
