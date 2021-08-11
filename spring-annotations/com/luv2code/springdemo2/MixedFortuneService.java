package com.luv2code.springdemo2;

import java.util.Random;

public class MixedFortuneService implements FortuneService{
	String[] mixedFortunes = {"Today is your Lucky day"," No luck today","Try Again"};
	@Override
	public String getFortune() {
		Random rand = new Random();
		int retunedFortuneNum = rand.nextInt(3);
		return mixedFortunes[retunedFortuneNum];
	}

}
