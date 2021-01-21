/**
 * @Author： supconit
 * @Date： 2021/1/20
 * @Description：
 */
package com.steven.springboottest2.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ScopeTest {
}
