package com.samples.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello()
	{	ModelAndView  mv=new ModelAndView();
		mv.setViewName("hello");
		mv.addObject("id",200);
		mv.addObject("name","suba");
		mv.addObject("age",20);
		return mv;
		
	}

}
