package io.tuna.boot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class RestRunner implements ApplicationRunner {
    @Autowired
    WebClient.Builder builder;

    @Autowired
    RestTemplateBuilder restTemplateBuilder;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        RestTemplate restTemplate = restTemplateBuilder.build();
        String helloResult = restTemplate.getForObject("http://localhost:8080/hello",String.class);
        System.out.println(helloResult);

        String worldResult = restTemplate.getForObject("http://localhost:8080/world ",String.class);
        System.out.println(worldResult);
    }
}
