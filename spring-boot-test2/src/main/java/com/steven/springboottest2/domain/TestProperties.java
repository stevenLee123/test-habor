/**
 * @Author： supconit
 * @Date： 2021/1/20
 * @Description：
 */
package com.steven.springboottest2.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("test-properties")
public class TestProperties  implements DisposableBean {

    private String name;

    private Integer age;

    public void setName(String name) {
        System.out.println(name);
        this.name = name;
    }

    public void setAge(Integer age) {
        System.out.println(age);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "TestProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this.toString());;
        System.out.println("destroy method......");
    }
}
