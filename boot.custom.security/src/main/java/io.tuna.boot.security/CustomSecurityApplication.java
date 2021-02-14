package io.tuna.boot.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomSecurityApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CustomSecurityApplication.class);
        app.run(args);
    }
}
