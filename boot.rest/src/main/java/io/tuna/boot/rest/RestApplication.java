package io.tuna.boot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(RestApplication.class);
        app.run(args);
    }
}
