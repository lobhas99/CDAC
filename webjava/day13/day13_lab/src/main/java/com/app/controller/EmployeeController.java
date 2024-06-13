package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	// depcy
	@Autowired
	private EmployeeService empService;

	// add a rq handling method to get emps by dept
	// URL : http://localhost:8080/spring_boot/employees/list ,
	// method=POST , payload : deptId=1
	@RequestMapping("/list")
	// @RequestParam Long deptId
	// Long deptId=Long.parseLong(request.getParameter("deptId"));
	// @RequestParam : method arg level annotation , for binding req param -->
	// method arg
	public String listEmpsByDept(Model map, 
			@RequestParam Long deptId, HttpSession session) {
		System.out.println("in list emps");
		// add dept id under session scope , since it's going to be required in next
		// requests!
		session.setAttribute("dept_id", deptId);
		// invoke service method
		map.addAttribute("emp_list", empService.getEmpsByDepartment(deptId));
		return "/emps/list";// AVN : /WEB-INF/views/emps/list.jsp

	}
	// add a rq handling method to delete emp by it's id n dept id
	// URL : http://localhost:8080/spring_boot/employees/delete?id=3
	// method=GET
	@GetMapping("/delete")
	public String deleteEmpDetails(@RequestParam Long id
			,HttpSession session)
	{
		System.out.println("in del emp details "+id);//emp id
		//get dept id from HttpSession
		Long deptId=(Long)session.getAttribute("dept_id");
		//invoke service layer method , to del emp from a specific dept
		session.setAttribute("message",empService.deleteEmpDetails(deptId,id));
		return "redirect:/employees/list?deptId="+deptId; 
		
	}

}
