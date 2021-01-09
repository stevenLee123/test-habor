package com.steven.springaoptess1.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBean implements InvocationHandler {

    private Object target = null;

    private Interceptor interceptor = null;

    public static Object getProxyBean(Object object,Interceptor interceptor){
        ProxyBean proxyBean = new ProxyBean();
        proxyBean.target = object;
        proxyBean.interceptor = interceptor;
        Object proxy = Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),proxyBean);
        return proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        boolean exceptionFlag = false;
        Invocation invocation = new Invocation(target,method,args);
        Object resObj = null;

        try {
            if(this.interceptor.before()){
                resObj = this.interceptor.around(invocation);
            }else{
                resObj = invocation.proceed();
            }
        }catch (Exception e){
            exceptionFlag = true;
        }
        this.interceptor.after();
        if(exceptionFlag){
            this.interceptor.afterThrowing();
        }else {
            this.interceptor.afterReturning();
        }
        return resObj;
    }
}
