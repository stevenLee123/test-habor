package com.steven.springaoptess1.aop;

import com.steven.springaoptess1.service.HelloworldService;
import com.steven.springaoptess1.service.impl.HelloworldServiceImpl;

public class AOPTest1 {
    public static void main(String[] args) {
        HelloworldService helloworldService = new HelloworldServiceImpl();
        HelloworldService proxy = (HelloworldService) ProxyBean.getProxyBean(helloworldService,new MyInterceptor());
        proxy.sayHello("hello");
        System.out.println("-------------------line------------------");
        proxy.sayHello(null);
    }
}
