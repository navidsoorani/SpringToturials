package com.example.springsimple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/user")
    public String user() {
        return "USER endpoint";
    }

    @GetMapping("/admin")
    public String admin() {
        return "ADMIN endpoint";
    }
}