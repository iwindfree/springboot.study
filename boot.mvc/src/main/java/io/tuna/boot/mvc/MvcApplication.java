package io.tuna.boot.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MvcApplication.class);
        app.run(args);
    }
}
