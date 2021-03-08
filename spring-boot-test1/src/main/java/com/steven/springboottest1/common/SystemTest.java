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

        System.out.println(Integer.toBinaryString(-2));

        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;

        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
        long l = -1;
        System.out.println(Long.toBinaryString(l));
        l >>>= 10;
        System.out.println(Long.toBinaryString(l));
        short s = -1;
        System.out.println(Integer.toBinaryString(s));
        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));
        byte b = -1;
        System.out.println(Integer.toBinaryString(b));
        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));
        b = -1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b>>>10));

        System.out.println(Integer.toBinaryString(~-3));
    }
}
