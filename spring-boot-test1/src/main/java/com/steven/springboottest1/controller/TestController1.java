package com.steven.springboottest1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class TestController1 {

    @GetMapping("/hello")
    public String test1(){
        return "hello world";
    }
}
