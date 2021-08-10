package com.luv2code.springdemo2;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice speed skating";
	}

}
