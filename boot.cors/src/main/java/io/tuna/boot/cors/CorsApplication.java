package io.tuna.boot.cors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CorsApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CorsApplication.class);
        app.run(args);
    }
}
