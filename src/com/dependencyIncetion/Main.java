package com.dependencyIncetion;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	public static void main(String[]args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		BeanFactory factory = context;
		
		CompositeService compositeService = (CompositeService) factory.getBean("compositeService");
		compositeService.sendMessage();
	}


}
