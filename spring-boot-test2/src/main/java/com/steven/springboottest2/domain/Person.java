/**
 * @Author： supconit
 * @Date： 2021/1/20
 * @Description：
 */
package com.steven.springboottest2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    private Animal dog;

    public Animal getDog() {
        return dog;
    }
}
