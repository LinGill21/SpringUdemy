package com.luv2code.springdemo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		System.out.println("Are they the same? "+ result);
		System.out.println("the Coach Memory" + theCoach);
		System.out.println("alpha Coach Memory" + alphaCoach);
		
		//close context
		context.close();
	}

}
