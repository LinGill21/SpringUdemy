package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		GymnasticCoach theCoach = context.getBean("myGymnasticCoach",GymnasticCoach.class);
		
		//call method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//call our new methods to get the literal values
		//System.out.println(theCoach.getEmailAddress());
		//System.out.println(theCoach.getTeam());
		
		//close context
		context.close();
	}

}
