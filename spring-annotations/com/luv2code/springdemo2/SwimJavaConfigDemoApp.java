package com.luv2code.springdemo2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		//call a method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//call our new method
		System.out.println(theCoach.getCoachInfo());
		//close the context
		context.close();

	}

}
