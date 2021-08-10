package com.luv2code.springdemo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		//call a method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
