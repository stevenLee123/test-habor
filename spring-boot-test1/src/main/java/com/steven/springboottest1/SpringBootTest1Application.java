package com.steven.springboottest1;

import com.steven.springboottest1.controller.TestController1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

//@EnableAutoConfiguration
//@ComponentScan
//@SpringBootConfiguration
//@EnableWebSecurity
@SpringBootApplication
public class SpringBootTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest1Application.class, args);
    }


}
