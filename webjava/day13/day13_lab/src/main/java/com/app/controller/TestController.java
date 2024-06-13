package com.app.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
	private long pageVisits;
	public TestController() {
		System.out.println("in ctor of "+getClass());
	}
	//add req handling method to test Model n View
	@GetMapping("/test1")
	public ModelAndView testModelAndView() {
		System.out.println("in test mnv");
		++pageVisits;
		//ModelAndView(String lvn , String modelAttrName,Object attrValue)
		return new ModelAndView("/test/test1", 
				"server_ts", LocalDateTime.now());//AVN : /WEB-INV/views/test/test1.jsp
	}
	//add req handling method to increment method visit counter
	@GetMapping("/test2")
	public ModelAndView testPageVisits() {
		System.out.println("in page visits");
		return new ModelAndView("/test/test2", "visits", ++pageVisits);
		//AVN : /WEB-INV/views/test/test2.jsp
	}
	//add req handling method to test model map (visits n server ts)
	@GetMapping("/test3")
	public String testModelMap(Model modelMap) {
		System.out.println("in test model map "+modelMap);//{}
		modelMap.addAttribute("ts", LocalDateTime.now())
		.addAttribute("visits", ++pageVisits);
		System.out.println(modelMap);//populated map
		return "/test/test3";//AVN : /WEB-INV/views/test/test3.jsp
		/*
		 * Handler rets explicitly : LVN 
		 * SC implcitly rets model map --> D.S
		 * D.S ---> LVN --> V.R --> AVN
		 * D.S --> adds these model attrs under req scope n then forwards
		 * the clnt , to the view layer
		 */
	}
	
	

}
