package com.spring.demo.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisCluster;

import java.util.List;

@Component
public class RedisClusterUtils {

    @Autowired
    private JedisCluster jedisCluster;

    /**
     * 得到指定key值的value
     * @param key
     */
    public Object get(String key){
        return jedisCluster.get(key);
    }

    /**
     * 保存指定key值的value
     * @param key
     * @param value
     */
    public void set(String key, String value){
        jedisCluster.set(key, value);
    }

    /**
     * 保存指定key值的value
     * @param key
     * @param list
     */
    public void set(String key, List<String> list){
        jedisCluster.rpush(key, (String[]) list.toArray());
    }

    /**
     * 删除指定key的value
     * @param key
     */
    public void del(String key){
        jedisCluster.del(key);
    }
}
