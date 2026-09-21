package com.hello.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.dto.Data;

@RestController
@RequestMapping("/api/v1")
public class Hello {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/data")
    public Data getDta() {
        return new Data("Data fetched successfully", 200, true);
    }
}
