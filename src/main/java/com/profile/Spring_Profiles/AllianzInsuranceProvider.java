package com.profile.Spring_Profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("uat")
public class AllianzInsuranceProvider implements LifeInsurance {

	@Override
	public void purchacePolicy(String env) {
		System.out.println("Thank You For Purchase Allianz Insurance @ " +env);
		
	}

}
