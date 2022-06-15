package com.example.multipleredisjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class Teste implements CommandLineRunner {

    @Autowired
    @Qualifier("redis2RedisTemplate")
    private RedisTemplate<String, String> redisTemplate2;
   @Autowired
    @Qualifier("redis1RedisTemplate")
    private RedisTemplate<String, String> redisTemplate1;

    @Override
    public void run(String... strings) throws Exception {
        try {
            for (int i = 0; i < 10; i++) {

                String key = "key" + i;

               redisTemplate1.opsForValue().set("Teste database 1", "chora");
                redisTemplate2.opsForValue().set("Teste database 2", "chora2");
            }
        }catch(Exception ex) {
            throw ex;
        }
    }
}