/**
 * @Author： supconit
 * @Date： 2021/1/20
 * @Description：
 */
package com.steven.springboottest2.component;

import com.steven.springboottest2.domain.ScopeTest;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import sun.reflect.generics.scope.Scope;

import javax.annotation.PreDestroy;

@Component
public class ScopeTestAware  implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PreDestroy
    public void test(){
        ScopeTest scopeTest1 = applicationContext.getBean(ScopeTest.class);
        ScopeTest scopeTest2 = applicationContext.getBean(ScopeTest.class);
        System.out.println(scopeTest1 == scopeTest2);

    }

}
