package com.profile.Spring_Profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfilesApplication implements CommandLineRunner {

	@Value("${profile.qa.database}")
	private String qaDatabase;
	
	@Value("${application.environment.name:my default value}")
	private String environmentName;
	
	@Autowired
	private LifeInsurance lifeInsurance;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringProfilesApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Name of the QA database : " + qaDatabase);
		lifeInsurance.purchacePolicy(environmentName);
		
		
		
	}

	
	
	
	
}
