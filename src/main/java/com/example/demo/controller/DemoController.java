package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/helloworld")
    public String hello() {
        return getString();
    }

    private String getString() {
    	return "Hello";
    }
}
