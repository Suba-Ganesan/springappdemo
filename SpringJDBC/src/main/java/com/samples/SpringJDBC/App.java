package com.samples.SpringJDBC;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/SpringJdbc/Springconfig.xml");

		JdbcTemplate Template = (JdbcTemplate) springContainer.getBean("jdbctemplate");
		
		String query = "insert into employee values (?, ?, ?,?)";
		int updateResult = Template.update(query, 5, "John", "clerk",10000);
		System.out.println("Number of records inserted: " + updateResult);
		
//		String query1 = "delete from employee where name=?";
//		int updateResult1 = Template.update(query1,"John");
//		System.out.println("Number of records deleted: " + updateResult1);
	
		
    }
}
