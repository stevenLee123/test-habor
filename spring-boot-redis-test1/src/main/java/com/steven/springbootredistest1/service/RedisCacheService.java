/**
 * @Author： supconit
 * @Date： 2021/1/21
 * @Description：
 */
package com.steven.springbootredistest1.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    @Cacheable(value="test1",key = "#p0")
    public String useRedisCache(String a){
        return "this is a redis cache test";
    }

    @CacheEvict(value = "test1",key = "#p0")
    public String clearCache(String a){
        return "clear cache ....";
    }
}
