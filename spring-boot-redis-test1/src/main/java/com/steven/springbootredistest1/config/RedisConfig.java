/**
 * @Author： supconit
 * @Date： 2021/1/11
 * @Description：
 */
package com.steven.springbootredistest1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.Topic;

@Configuration
public class RedisConfig {


    @Bean
    public RedisMessageListenerContainer initRedisMessageListenerContainer(
            RedisConnectionFactory redisConnectionFactory,MessageListener messageListener){
        RedisMessageListenerContainer redisMessageListenerContainer =
                new RedisMessageListenerContainer();
        redisMessageListenerContainer.setConnectionFactory(redisConnectionFactory);
        Topic topic = new ChannelTopic("test-redis");
        redisMessageListenerContainer.addMessageListener(messageListener,topic);
        return redisMessageListenerContainer;
    }
}
