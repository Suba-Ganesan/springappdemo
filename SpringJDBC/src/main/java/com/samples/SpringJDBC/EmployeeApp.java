package com.samples.SpringJDBC;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.SpringJDBC.dao.EmployeeDAO;
import com.samples.SpringJDBC.dto.Employee;


public class EmployeeApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/SpringJDBC/Springconfig.xml");

		EmployeeDAO employeeDao = (EmployeeDAO) springContainer.getBean("employeedaoimpl");
		
// createEmployee(employeeDao);
		
//		updateEmployee(employeeDao);
		
//		deleteEmployee(employeeDao);
		
	//	readEmployee(employeeDao);
		readAllEmployees(employeeDao);
		

	}

	private static void readAllEmployees(EmployeeDAO employeeDao) {
		// TODO Auto-generated method stub
		List<Employee> employees = employeeDao.read();
		System.out.println(employees);
		
	}

	private static void readEmployee(EmployeeDAO employeeDao) {
		Employee employee = employeeDao.read(4);
		System.out.println(employee);
	}

	private static void deleteEmployee(EmployeeDAO employeeDao) {
		employeeDao.delete(1);
	}
	private static void updateEmployee(EmployeeDAO employeeDao) {
		Employee emp = new Employee();
		emp.setEid(7);
		emp.setName("Bob");
		emp.setDesignation("Rockwell");
		emp.setSalary(42000);
		
		employeeDao.update(emp);
	}
	
		private static void createEmployee(EmployeeDAO employeeDao) {
		Employee emp = new Employee();
		emp.setEid(2);
		emp.setName("Dexter");
		emp.setDesignation("Johnson");
		emp.setSalary(42000);
		
		employeeDao.create(emp);
		

	}
}
