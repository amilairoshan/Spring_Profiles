package com.profile.Spring_Profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



@Configuration
@ConfigurationProperties(prefix = "yaml")
@PropertySource(value="classpath:application-credential.yml",factory = YamlPropertySource.class)
public class MyDataSourceConfiguration {

	@Bean
	public MyDataSource generateMyDataSource(@Value("${datasource.mysql.username}") String userName,@Value("${datasource.mysql.password}") String password) {
		
		MyDataSource myDataSource =new MyDataSource();
		myDataSource.setUserName(userName);
		myDataSource.setPassword(password);
		
		System.out.println("My Datasource UserName:"+userName);
		System.out.println("My Datasource Password:"+password);
		return myDataSource;
				
	}
	
	
	
}
