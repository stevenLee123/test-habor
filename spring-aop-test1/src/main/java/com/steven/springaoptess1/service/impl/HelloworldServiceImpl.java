package com.steven.springaoptess1.service.impl;

import com.steven.springaoptess1.service.HelloworldService;
import org.springframework.stereotype.Service;

@Service
public class HelloworldServiceImpl implements HelloworldService {
    @Override
    public String sayHello(String name) {
        if (name == null ||name.trim() == "") {
            throw new RuntimeException("parameter is null ! ! ");
        }
        System.out.println ("hello "  + name);
        return "hello "  + name;
    }
}
