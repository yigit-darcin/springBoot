package com.yigit.darcin.web.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionsHandler {

    @ResponseBody
    @ExceptionHandler(IllegalStateException.class)
    public String handle(IllegalStateException e) {
        return "IllegalStateException handled!";
    }


    @ResponseBody
    @ExceptionHandler(IllegalArgumentException.class)
    public String handle(IllegalArgumentException e) {
        return "IllegalArgumentException handled!";
    }
}
