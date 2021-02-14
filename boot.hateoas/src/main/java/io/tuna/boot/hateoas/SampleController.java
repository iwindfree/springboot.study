package io.tuna.boot.hateoas;

import org.apache.naming.factory.ResourceLinkFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/hello")
    public Hello hello() {
        Hello hell0 = new Hello();
        hell0.setPrefix("Hey,");
        hell0.setName("knamkim");
        return hell0;
    }
}
