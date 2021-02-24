package com.steven.springbootredistest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootRedisTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRedisTest1Application.class, args);
    }

}
