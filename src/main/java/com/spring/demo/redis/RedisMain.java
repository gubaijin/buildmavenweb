package com.spring.demo.redis;

/**
 * Created by ehsy_it on 2016/8/7.
 */
public class RedisMain {

    public static void main(String[] args) {
        //单机redis、spring集成
        /*ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-redis.xml");
        RedisUtils redisUtils = (RedisUtils) ctx.getBean("redisUtils");
        redisUtils.set("china","瓷器");
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        redisUtils.set("list", list);
        System.out.println("china=" + redisUtils.get("china"));
        System.out.println("list[1]=" + ((List)redisUtils.get("list")).get(1));*/

        //使用jedis在代码中连接redis集群，因为是集群，可以自动发现，也同样只要一个地址就行了
        /*Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
        //Jedis Cluster will attempt to discover cluster nodes automatically
        jedisClusterNodes.add(new HostAndPort("192.168.240.142", 6379));
        JedisCluster jc = new JedisCluster(jedisClusterNodes);
        jc.set("foo", "bar");
        String value = jc.get("foo");
        System.out.println(value);*/

        //spring集成redis集群
        /*ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-redisCluster.xml");
        RedisClusterUtils redisClusterUtils = (RedisClusterUtils) ctx.getBean("redisClusterUtils");
        redisClusterUtils.set("redisCluster", "RedisClusterUtils");
        System.out.println(redisClusterUtils.get("redisCluster"));*/
    }
}
