package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//Retrieve bean from spring
		Coach theCoach = context.getBean("myGymnasticCoach",Coach.class);
		Coach alphaCoach = context.getBean("myGymnasticCoach",Coach.class);
		
		//check if they are the same 
		boolean result = (theCoach == alphaCoach);
		
		//print out results
		System.out.println("point to same object "+ result);
		System.out.println("memory location thecoach "+ theCoach);
		System.out.println("memory location alphacoach "+ alphaCoach);
		
		//close context
		context.close();

	}

}
