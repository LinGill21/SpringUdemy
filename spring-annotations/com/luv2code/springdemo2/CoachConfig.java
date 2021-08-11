package com.luv2code.springdemo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfig {
	//fortune Bean
	@Bean
	public FortuneService mixedFortuneService() {
		return new MixedFortuneService();
	}
	@Bean
	public Coach sportsCoach() {
		return new SportsCoach(mixedFortuneService());
	}
}
