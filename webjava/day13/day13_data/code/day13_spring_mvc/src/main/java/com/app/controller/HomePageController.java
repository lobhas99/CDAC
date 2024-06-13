package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
	public HomePageController() {
		System.out.println("in ctor of "+getClass());
	}
	//add req handling method to render home page
	@GetMapping("/") //@GetMapping =@RequestMapping(method=GET)
	public String renderHomePage() {
		System.out.println("in render hm page");
		return "/index";//AVN : /WEB-INF/views/index.jsp
	}

}
