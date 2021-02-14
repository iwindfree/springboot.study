package io.tuna.boot.exceptionhandle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class ExceptionApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ExceptionApplication.class);
        app.run(args);
    }



}
