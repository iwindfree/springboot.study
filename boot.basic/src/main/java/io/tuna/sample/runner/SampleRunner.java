package io.tuna.sample.runner;

import io.tuna.sample.props.SampleProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {
    @Autowired
    SampleProperty sampleProperty;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("======== sample runner ==========");
        System.out.println(args.getOptionNames().toString());
        System.out.println("Property name:" + sampleProperty.getName());
        System.out.println("Property age:" + sampleProperty.getAge());
    }
}
