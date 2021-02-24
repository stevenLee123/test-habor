/**
 * @Author： supconit
 * @Date： 2021/2/24
 * @Description：
 */
package com.steven.springboottest1.common;

public class SystemTest {

    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}
