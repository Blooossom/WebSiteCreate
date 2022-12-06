package com.example.websitecreate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.websitecreate.mapper"})
public class WebSiteCreateApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSiteCreateApplication.class, args);
	}

}
