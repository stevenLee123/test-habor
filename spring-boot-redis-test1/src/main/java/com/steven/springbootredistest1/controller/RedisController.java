/**
 * @Author： supconit
 * @Date： 2021/1/11
 * @Description：
 */
package com.steven.springbootredistest1.controller;

import com.steven.springbootredistest1.service.RedisCacheService;
import com.steven.springbootredistest1.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SessionCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private RedisCacheService redisCacheService;

    @GetMapping(value = "/redis")
    public String sendMessage(@RequestParam(value = "topic") String topic,
                              @RequestParam("message") String message){
        redisService.sendMessagetoChannel(topic,message);
        return "success";
    }

    @GetMapping(value = "/redisPipline")
    public Map<String,Object> testPipeLine(){
        Long start = System.currentTimeMillis();
        List list = (List)redisTemplate.executePipelined(new SessionCallback() {
            @Override
            public Object execute(RedisOperations operations) throws DataAccessException {
                for (int i = 0; i < 10000; i++) {
                    operations.opsForValue().set("pipeline_"+i,"value_"+i);
                    String value = (String) operations.opsForValue().get("pipeline_"+i);
                }
                return null;
            }
        });
        Long end = System.currentTimeMillis();

        Map<String,Object> map = new HashMap<>();
        map.put("success",true);
        map.put("time",(end-start)/1000);
        return map;

    }

    @GetMapping(value = "/redisCache")
    public String testCache(){
        return redisCacheService.useRedisCache("testkey");
    }

    @GetMapping(value = "/redisCache2")
    public String testCache2(){
        return redisCacheService.clearCache("testkey");
    }
}
