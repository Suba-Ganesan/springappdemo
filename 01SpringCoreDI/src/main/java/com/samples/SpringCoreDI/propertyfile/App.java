package com.samples.SpringCoreDI.propertyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/samples/SpringCoreDI/propertyfile/SpringConfig.xml");
		myDao dao = (myDao) context.getBean("dao");
		System.out.println(dao);
		
	}

}