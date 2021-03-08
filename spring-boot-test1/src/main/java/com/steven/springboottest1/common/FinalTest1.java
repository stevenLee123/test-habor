/**
 * @Author： supconit
 * @Date： 2021/2/28
 * @Description：
 */
package com.steven.springboottest1.common;

class testObj{
    int i = 0;
    public testObj(int a) {
        System.out.println(a);
    }
}

public class FinalTest1 {
    final testObj t1 = new testObj(1);
    private final testObj t2 = new testObj(2);

    public static void main(String[] args) {

        FinalTest1 f1 = new FinalTest1();
        f1.t1.i++;
    }


}
