package com.samples.SpringCoreDI.Scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/SpringCoreDI/Scopes/SpringConfig.xml");
		 
		 Employee emp = (Employee) springContainer.getBean("emp");
		 System.out.println(emp.hashCode());
		 
		 Employee emp1 = (Employee) springContainer.getBean("emp");
		 System.out.println(emp1.hashCode());
		    }

}
