package io.tuna.boot.hateoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HateOasApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(HateOasApplication.class);
        app.run(args);
    }
}
