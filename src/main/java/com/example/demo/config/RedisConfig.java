package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {
	
	@Bean
	public RedisConnectionFactory getConnectionFactory() {
		return new JedisConnectionFactory();
	}
	
	@Bean
	public RedisTemplate<?,?> getRedisTemplate(){
		RedisTemplate<?, ?> template = new RedisTemplate();
		template.setConnectionFactory(getConnectionFactory());
		return template;
	}

}
