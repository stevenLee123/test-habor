package com.steven.springboottest2;

import com.steven.springboottest2.domain.Animal;
import com.steven.springboottest2.domain.Person;
import com.steven.springboottest2.domain.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"classpath:jdbc.properties"},ignoreResourceNotFound = true)
public class SpringBootTest2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest2Application.class, args);
//        ApplicationContext ctx =new AnnotationConfigApplicationContext(SpringBootTest2Application.class) ;
//        Person person = ctx.getBean(Person.class);
//        person.getDog().eat();
//
//        TestProperties testProperties = ctx.getBean(TestProperties.class);
//        System.out.println(testProperties);
    }

}
