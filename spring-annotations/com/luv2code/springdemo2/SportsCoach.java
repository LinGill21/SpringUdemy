package com.luv2code.springdemo2;

public class SportsCoach implements Coach {
	private FortuneService fortuneService;
	
	public SportsCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice baseball, basketball and soccer" ;
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
