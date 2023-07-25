package com.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    Environment environment;

    @GetMapping("/check/config")
    public String check() {
        System.out.println("message :" + environment.getProperty("message"));
        return "config server working fine";
    }
}
