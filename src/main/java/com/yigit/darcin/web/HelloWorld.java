package com.yigit.darcin.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String hello() {
        return "Hello?";
    }

    @RequestMapping("/throwMe")
    public String exception() {
        throw new IllegalArgumentException("sorry mate");
    }


}
