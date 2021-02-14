package io.tuna.boot.exceptionhandle.controller;

import io.tuna.boot.exceptionhandle.AppError;
import io.tuna.boot.exceptionhandle.SampleException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    @GetMapping("/hello")
    public String hello() throws SampleException {
        throw new SampleException();
    }

    @ExceptionHandler(SampleException.class)
    public @ResponseBody     AppError sampleError(SampleException e) {
        AppError error = new AppError();
        error.setMessage("error.app.key");
        error.setReason("I don't know");
        return error;

    }

}
