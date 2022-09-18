package com.samples.SpringCoreDI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/SpringCoreDI/SpringConfig.xml");
       //*********tomcat container**************
       //Employee eobj=new Employee();
       //eobj.setId(10);
       //eobj.setName("xyz");
       
             //***********spring container************** 
	Employee emp = (Employee) springContainer.getBean("emp");
    System.out.println(emp);
       
    //Hospital hos = (Hospital) springContainer.getBean("hos"); 
    //System.out.println(hos);
		
     //Customer cus = (Customer) springContainer.getBean("cus"); 
     //System.out.println(cus); 
      
       //CarDealer dealer = (CarDealer) springContainer.getBean("cardealer");
       //System.out.println(dealer);
       
//       ShoppingCart shoppingcart=(ShoppingCart) springContainer.getBean("shoppingcart");
//       System.out.println(shoppingcart);
       
//       Students student = (Students) springContainer.getBean("stu");
//       System.out.println(student);
       
//    AbstractApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/SpringCoreDI/SpringConfig.xml");
//   	Patient patient = (Patient) springContainer.getBean("patient");
//   	System.out.println(patient);
//   	springContainer.registerShutdownHook();
       }
}