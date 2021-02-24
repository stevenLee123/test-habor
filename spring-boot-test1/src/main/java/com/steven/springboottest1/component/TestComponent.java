/**
 * @Author： supconit
 * @Date： 2021/1/20
 * @Description：
 */
package com.steven.springboottest1.component;

import org.springframework.stereotype.Component;

@Component
public class TestComponent {

    public void test(){
        System.out.println("test non component scan......");
    }
}
