package com.yc.C85S3Plgyblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yc.C85S3Plgyblog.dao")
public class C85S3PlgyBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(C85S3PlgyBlogApplication.class, args);
	}

}
