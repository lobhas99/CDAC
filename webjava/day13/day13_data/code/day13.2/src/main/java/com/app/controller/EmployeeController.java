package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	// depcy
	@Autowired
	private EmployeeService empService;
	//add a rq handling method to get emps by dept
	//URL : http://localhost:8080/spring_boot/employees/list , 
	//method=POST , payload : deptId=1
	@PostMapping("/list")
	//@RequestParam Long deptId
	//Long deptId=Long.parseLong(request.getParameter("deptId"));
	public String listEmpsByDept(Model map,@RequestParam Long deptId)
	{
		System.out.println("in list emps");
		//invoke service method
		map.addAttribute("emp_list",empService.getEmpsByDepartment(deptId));
		return "/emps/list";//AVN : /WEB-INF/views/emps/list.jsp
				
	}
	
	

}
