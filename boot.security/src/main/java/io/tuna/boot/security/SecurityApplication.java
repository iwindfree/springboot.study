package io.tuna.boot.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {
    public static void main(String[] args) {
        SpringApplication app  = new SpringApplication(SecurityApplication.class);
        app.run(args);
    }
}
