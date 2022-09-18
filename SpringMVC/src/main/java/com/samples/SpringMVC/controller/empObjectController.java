package com.samples.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samples.SpringMVC.domain.Employee;

@Controller
public class empObjectController {
	@RequestMapping("/emp")
	public ModelAndView singleEmployee()
	{	ModelAndView mv=new ModelAndView();
		mv.setViewName("empForm");
		Employee emp=new Employee();
	 	emp.setEmpid(5);
	 	emp.setSalary(5000);
	 	emp.setName("guru");
	 	
		mv.addObject("empdetail",emp);
		return mv;
		
	}

}
