/**
 * @Author： supconit
 * @Date： 2021/1/11
 * @Description：
 */
package com.steven.springbootredistest1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public void sendMessagetoChannel(String topic,String message){
        redisTemplate.convertAndSend(topic,message);
    }
}
