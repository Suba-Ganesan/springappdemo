package com.samples.SpringCoreDI.Constructors;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
 public static void main(String[] args) {
	 ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/SpringCoreDI/Constructors/SpringConfig.xml");
	
	 Employee emp = (Employee) springContainer.getBean("emplo");
	 System.out.println(emp);
}
}
