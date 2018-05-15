package com.nows;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@SpringBootApplication
@EntityScan(basePackageClasses = { SpringStarterBlogApplication.class, Jsr310JpaConverters.class })
@EnableCaching
public class SpringStarterBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStarterBlogApplication.class, args);
	}
}