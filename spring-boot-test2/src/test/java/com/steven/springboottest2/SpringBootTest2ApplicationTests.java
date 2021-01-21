package com.steven.springboottest2;

import com.steven.springboottest2.domain.Animal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringBootTest2ApplicationTests {

    @Autowired
    private Animal dog;

    @Test
    void contextLoads() {
    }

    @Test
    void test1(){
        dog.eat();
    }

}
