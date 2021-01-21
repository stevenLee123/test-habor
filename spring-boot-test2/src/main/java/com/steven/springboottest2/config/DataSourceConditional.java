/**
 * @Author： supconit
 * @Date： 2021/1/20
 * @Description： 条件装配
 */
package com.steven.springboottest2.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DataSourceConditional implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        return env.containsProperty("datasource.url")
                && env.containsProperty("datasource.username")
                && env.containsProperty("datasource.password")
                && env.containsProperty("datasource.driver-class-name");
    }
}
