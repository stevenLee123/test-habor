/**
 * @Author： supconit
 * @Date： 2021/1/11
 * @Description：
 */
package com.steven.springbootredistest1.controller;

import com.steven.springbootredistest1.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @GetMapping(value = "/redis")
    public String sendMessage(@RequestParam(value = "topic") String topic,
                              @RequestParam("message") String message){
        redisService.sendMessagetoChannel(topic,message);
        return "success";
    }
}
