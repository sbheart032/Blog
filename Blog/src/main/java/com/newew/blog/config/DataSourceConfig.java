package com.newew.blog.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

	//DB 사용을 위한 설정 파일로 application.properties에 
	//선언된 spring.datasource.* 값들로 DataSource로 빌드하기 위해 사용
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource dataSource(){
    	return DataSourceBuilder.create().build();
	}
}
