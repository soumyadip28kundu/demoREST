package com.example.demoREST.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/helloworld")
    public String getHelloWorld(){
        return "Hello World";
    }
}
