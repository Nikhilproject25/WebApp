package com.example.WebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping ("/hello")
    public String home() {
        return "Hello World welcome to Spring Boot!";
    }
}
