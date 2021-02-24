package com.steven.springboottest1.controller;

import com.steven.springboottest1.component.TestComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
//@EnableAutoConfiguration
public class TestController1 {

    @Autowired
    private TestComponent testComponent;

    @GetMapping("/hello")
    public String test1(){
        testComponent.test();
        return "hello world";
    }
}
