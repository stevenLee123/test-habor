/**
 * @Author： supconit
 * @Date： 2021/1/24
 * @Description：
 */
package com.steven.springboottest2.pytest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PythonTest {

    public static void main(String[] args) {
        try {
            System.out.println("start");
            String[] args1=new String[]{"python","helloworld.py"};
            Process pr=Runtime.getRuntime().exec(args1);

            BufferedReader in = new BufferedReader(new InputStreamReader(
                    pr.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            pr.waitFor();
            System.out.println("end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
