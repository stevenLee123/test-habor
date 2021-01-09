package com.steven.springaoptess1.controller;


import com.steven.springaoptess1.aop2.ArgsDetector;
import com.steven.springaoptess1.aop2.ArgsDetectorImpl;
import com.steven.springaoptess1.service.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class HelloworldController {

    @Autowired
    private HelloworldService helloworldService;

    @GetMapping(value = "/hello")
    public String helloworld(@RequestParam(value = "name",required = false) String args){

        ArgsDetector argsDetector = (ArgsDetector) helloworldService;
        if(argsDetector.validate(args)){
            return helloworldService.sayHello(args);
        }
        return null;
    }
}
