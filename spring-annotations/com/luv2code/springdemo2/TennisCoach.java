package com.luv2code.springdemo2;

import org.springframework.stereotype.Component;
import com.luv2code.springdemo2.Coach;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
