package io.tuna.boot.mvc.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    //@RestController 이 있으면 @ResponseBody 를 생략할 수 있음.
    @PostMapping("/users/create")
    public @ResponseBody User create(@RequestBody User user) {
        return user;
    }
}
