package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	//add new feild for emailaddress and team
	private String emailAddress;
	private String team;
	
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
	//Create getter/setter for email and team 
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method-setemailAddress");
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method-setTeam");
		this.team = team;
	}
	
	

}
