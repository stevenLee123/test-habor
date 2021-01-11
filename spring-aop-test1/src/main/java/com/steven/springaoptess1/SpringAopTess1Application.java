package com.steven.springaoptess1;

import com.steven.springaoptess1.aop2.AspectTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringAopTess1Application {

    @Bean
    public AspectTest getAspect(){
        return new AspectTest();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAopTess1Application.class, args);
    }

}
