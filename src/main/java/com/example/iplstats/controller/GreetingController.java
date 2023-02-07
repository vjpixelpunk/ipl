package com.example.iplstats.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {
    @GetMapping("/greetings")
    public String greet(){
        return "Welcome to Spring boot world!";
    }


}
