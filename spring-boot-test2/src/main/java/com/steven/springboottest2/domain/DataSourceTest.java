/**
 * @Author： supconit
 * @Date： 2021/1/20
 * @Description：
 */
package com.steven.springboottest2.domain;

import com.steven.springboottest2.config.DataSourceConditional;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("datasource")
@Conditional(DataSourceConditional.class)
public class DataSourceTest implements DisposableBean {

    private String driverClassName;

    private String url;

    private String username;

    private String password;

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataSourceTest{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this.toString());
        System.out.println("destroy method .....");
    }
}
