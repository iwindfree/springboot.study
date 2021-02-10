package io.tuna.sample;

import io.tuna.sample.listener.SampleListener;
import io.tuna.sample.props.SampleProperty;
import org.apache.catalina.LifecycleException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class Application {
	public static void main(String[] args) throws LifecycleException {
		SpringApplication app = new SpringApplication(Application.class);
		app.addListeners(new SampleListener());
		app.run(args);
	}

}
