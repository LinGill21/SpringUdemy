package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside noarg constructor");
	}
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach: inside setter method-setFortuneService");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
