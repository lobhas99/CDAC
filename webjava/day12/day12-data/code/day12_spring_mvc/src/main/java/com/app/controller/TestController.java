package com.app.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
	public TestController() {
		System.out.println("in ctor of "+getClass());
	}
	//add req handling method to test Model n View
	@GetMapping("/test1")
	public ModelAndView testModelAndView() {
		System.out.println("in test mnv");
		//ModelAndView(String lvn , String modelAttrName,Object attrValue)
		return new ModelAndView("/test/test1", 
				"server_ts", LocalDateTime.now());
	}

}
