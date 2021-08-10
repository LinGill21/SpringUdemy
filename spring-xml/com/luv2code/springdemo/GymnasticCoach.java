package com.luv2code.springdemo;

public class GymnasticCoach implements Coach {
	FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do a backflip";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
