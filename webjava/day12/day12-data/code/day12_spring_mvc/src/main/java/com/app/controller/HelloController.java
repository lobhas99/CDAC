package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // mandatory cls level anno to tell SC
//, following is a req handling controller(=handler) : spring bean
//singleton n eager
public class HelloController {
	public HelloController() {
		System.out.println("in ctor of " + getClass());
	}
	//add request handling method to generate hello mesg
	@RequestMapping("/hello") //=> service method in servlet
	public String sayHello() 
	{
		System.out.println("in say hello");
		return "/welcome";//Handler --> LVN (logical/forward view name)
		//---> D.S
	}
}
