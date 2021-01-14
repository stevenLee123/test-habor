/**
 * @Author： supconit
 * @Date： 2021/1/13
 * @Description：
 */
package com.steven.springboottest1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebFluxConfig {

    @Bean
    public WebClient webClient(){
        return WebClient.create();
    }
}
