package com.nath.abhijit.springbootredisexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;

@SpringBootApplication(
		exclude = {RedisAutoConfiguration.class}
)
public class SpringBootRedisExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisExampleApplication.class, args);
	}

}
