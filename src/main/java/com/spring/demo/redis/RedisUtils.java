package com.spring.demo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by ehsy_it on 2016/8/7.
 */
@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    /**
     * 得到指定key值的value
     * @param key
     */
    public Object get(String key){
        return redisTemplate.boundValueOps(key).get();
    }

    /**
     * 保存指定key值的value
     * @param key
     * @param value
     */
    public void set(String key, Object value){
        redisTemplate.boundValueOps(key).set(value);
    }

    /**
     * 删除指定key的value
     * @param key
     */
    public void del(String key){
        redisTemplate.delete(key);
    }
}
