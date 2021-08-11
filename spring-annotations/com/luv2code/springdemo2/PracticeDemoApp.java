package com.luv2code.springdemo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeDemoApp {

	public static void main(String[] args) {
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);
		//get the bean from spring
		Coach theCoach = context.getBean("sportsCoach" ,Coach.class);
		
		//call method
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}

}
