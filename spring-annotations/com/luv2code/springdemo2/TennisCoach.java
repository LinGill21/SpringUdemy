package com.luv2code.springdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.luv2code.springdemo2.Coach;

@Component
public class TennisCoach implements Coach {
	@Autowired
	private FortuneService fortuneService;
	public TennisCoach() {System.out.println("Tennis coach contructor");}
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	*/
	
	//define setter method
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("In tennis fortune setter");
		this.fortuneService = fortuneService;
	}
*/
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
