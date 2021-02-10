package io.tuna.boot.mvc.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ThymeleafApplication.class);
        app.run(args);
    }


}
