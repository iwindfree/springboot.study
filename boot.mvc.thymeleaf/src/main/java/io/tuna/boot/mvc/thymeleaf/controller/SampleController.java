package io.tuna.boot.mvc.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
    @GetMapping("/hello")
    public String hello(Model model) { // view 이름을 리턴
        model.addAttribute("name","knamkim");
        return "hello";
    }

}
