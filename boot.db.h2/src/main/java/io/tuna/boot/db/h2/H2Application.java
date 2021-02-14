package io.tuna.boot.db.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(H2Application.class);
        app.run(args);
    }
}
