package com.samples.InterfaceInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.InterfaceInjection.service.OrderService;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/InterfaceInjection/SpringConfig.xml");

		OrderService service = (OrderService) springContainer.getBean("service");
		System.out.println(service);
		service.placeOrder();

	}
}