package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		Coach theCoach= context.getBean("myCoach",Coach.class);
		
		//call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		// lets call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();
	}

}
