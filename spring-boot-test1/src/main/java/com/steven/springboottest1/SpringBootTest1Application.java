package com.steven.springboottest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
@ComponentScan
@SpringBootConfiguration
public class SpringBootTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest1Application.class, args);
    }


}
