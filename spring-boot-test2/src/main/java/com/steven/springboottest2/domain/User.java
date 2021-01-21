/**
 * @Author： supconit
 * @Date： 2021/1/21
 * @Description：
 */
package com.steven.springboottest2.domain;

public class User {
    private String name;

    private String age;

    public User() {
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
