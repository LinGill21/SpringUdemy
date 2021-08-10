package com.luv2code.springdemo2;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class SadFortuneService implements FortuneService {
	private String[] fortuneArray= {"Dont bother","Suck to be you","Your lucky day is not today"};
	@Override
	public String getFortune() {
		Random rand = new Random();
		int fortuneNum = rand.nextInt(fortuneArray.length);
		return fortuneArray[fortuneNum];
	}

}
