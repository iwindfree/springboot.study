package io.tuna.sample;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ArguementTest {
    public ArguementTest(ApplicationArguments args) {
        System.out.println("args:" + args.toString());
    }
}
