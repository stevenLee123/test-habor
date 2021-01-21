/**
 * @Author： supconit
 * @Date： 2021/1/20
 * @Description：
 */
package com.steven.springboottest2.domain;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("dog eat shit....");
    }
}
