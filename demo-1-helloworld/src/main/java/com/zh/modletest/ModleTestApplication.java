package com.zh.modletest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication//开启组件扫描和自动配置
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class ModleTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModleTestApplication.class, args);
	}

}
