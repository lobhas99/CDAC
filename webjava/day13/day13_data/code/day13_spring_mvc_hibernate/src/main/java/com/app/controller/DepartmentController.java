package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.DepartmentService;

@Controller
@RequestMapping("/departments")
public class DepartmentController {
//depcy : service layer i/f
	@Autowired//(required = true)
	private DepartmentService deptService;
	@PostConstruct
	public void init() {
		System.out.println("in init "+deptService);
	}
	//add req handling method to list all depts
	//URL : http://host:port/ctx/departments/list , method =GET
	@GetMapping("/list")
	public String listAllDepts(Model map) {
		System.out.println("in list all depts "+map);
		//invoke service 's method to get list of depts
		map.addAttribute("dept_list", deptService.getAllDepartments());
		return "/departments/list";//AVN : /WEB-INF/views/departments/list.jsp
	}
	
	
}
