package com.profile.Spring_Profiles;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class CeylincoLifeInsuranceProvider implements LifeInsurance {

	@Override
	public void purchacePolicy(String env) {
		System.out.println("Thank You For Purchase CeylincoLife Insurance @ " +env);
		
	}

}
