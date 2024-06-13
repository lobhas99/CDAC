package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.DepartmentService;

@Controller // => request handling spring bean
@RequestMapping("/departments") // supplying class level pattern
public class DepartmentController {
//depcy : service layer i/f
	@Autowired // (required = true) autowire=byType ,using field level D.I
	private DepartmentService deptService;

	@PostConstruct
	public void init() {
		System.out.println("in init " + deptService);// not null
	}

	// add req handling method to list all depts
	// URL : http://host:port/ctx/departments/list , method =GET
	@GetMapping("/list")
	public String listAllDepts(Model map) // => Telling Sc to inject empty model attr map
	{
		System.out.println("in list all depts " + map);// {}
		// invoke service 's method to get list of depts n add it 
		//as the model attr(to share with view layer)
		map.addAttribute("dept_list", deptService.getAllDepartments());
		return "/departments/list";// AVN : /WEB-INF/views/departments/list.jsp
	}

}
