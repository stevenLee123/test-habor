package com.steven.springaoptess1.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectTest2 {

    @DeclareParents(value = "com.steven.springaoptess1.service.impl.HelloworldServiceImpl",defaultImpl = ArgsDetectorImpl.class)
    public ArgsDetector argsDetector;
}
