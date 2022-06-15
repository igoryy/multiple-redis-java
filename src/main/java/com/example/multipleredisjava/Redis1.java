package com.example.multipleredisjava;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.redis1")
public class Redis1 extends  RedisProperty{
}
