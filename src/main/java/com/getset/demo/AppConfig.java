package com.getset.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public MyRunnerTwo mrt() {
		return new MyRunnerTwo();
	}
	

}
