package com.steven.springaoptess1.aop2;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectTest {

    @Pointcut(value = "execution(* com.steven.springaoptess1.service.HelloworldService.sayHello(..))")
    public void pointCut1(){}

    @Before(value = "pointCut1()")
    public void beforeAdvice1(){
        System.out.println("-------------------before --------------");
    }

    @After(value = "pointCut1()")
    public void afterAdvice1(){
        System.out.println("--------------------after----------------------");
    }

    @Around(value = "pointCut1()")
    public void aroudAdvice(ProceedingJoinPoint joinPoint){
        if(joinPoint.getArgs()[0] != null){

            String arg = joinPoint.getArgs()[0].toString();
            System.out.println("-------get args:" + arg +"----------------");
        }
        System.out.println("---------------around before ---------------");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("----------around after --------------------");
    }

    @AfterReturning(value = "pointCut1()")
    public void afterReturningAdivice(){
        System.out.println("-----------after returning ---------------");

    }

    @AfterThrowing(value = "pointCut1()")
    public void afterThrowingAdvice(){
        System.out.println("----------------after throwing --------------");
    }
}
