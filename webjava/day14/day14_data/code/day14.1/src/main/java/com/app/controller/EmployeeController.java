package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Employee;
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
	public String listEmpsByDept(Model map, @RequestParam Long deptId, HttpSession session) {
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
	public String deleteEmpDetails(@RequestParam Long id, HttpSession session) {
		System.out.println("in del emp details " + id);// emp id
		// get dept id from HttpSession
		Long deptId = (Long) session.getAttribute("dept_id");
		// invoke service layer method , to del emp from a specific dept
		session.setAttribute("message", empService.deleteEmpDetails(deptId, id));
		return "redirect:/employees/list?deptId=" + deptId;
		/*
		 * Handler rets a redirect view name --> D.S D.S sends temp redirect resp (+
		 * performs URL encoding if neeed) to the clnt web browser sends next request
		 * URL : http://host:port/ctx/employees/list?deptId=3, method=GET
		 */

	}

	// Add a new method : to show emp update details form
	// URL : http://localhost:8080/spring_boot/employees/update?id=1
	// method=GET
	@GetMapping("/update")
	public String showUpdateForm() {
		System.out.println("in show update form");
		return "/emps/update";// AVN : /WEB-INF/views/emps/update.jsp
	}

	// Add a new method : to process emp update details form
	// URL : http://localhost:8080/spring_boot/employees/update?id=1
	// method=POST
	// req params : empId , salary
	@PostMapping("/update")
	public String processUpdateForm(@RequestParam Long empId, @RequestParam double salary, HttpSession session) {
		System.out.println("in process update form " + empId + " " + salary);
		Long deptId = (Long) session.getAttribute("dept_id");
		// invoke service layer method
		session.setAttribute("message", empService.updateEmpDetails(empId, salary));
		return "redirect:/employees/list?deptId=" + deptId;
	}

	// URL : http://localhost:8080/spring_boot/employees/add
	// add a method to show add emp form
	// 1. Form binding (data binding) : Add POJO in the method arg as the dependency
	@GetMapping("/add")
	public String showAddEmpForm(@ModelAttribute /* (name = "my_emp") */ Employee emp) {
		// @ModelAttribute => data binding from req params --> server side object
		// SC creates instance of emp n adds it as the model attribute
		System.out.println("in show add form "+emp);
		return "/emps/add";// AVN : /WEB-INF/views/emps/add.jsp
	}

	// URL : http://localhost:8080/spring_boot/employees/add
	// add a method to process add emp form
	// 3. Form binding (data binding) : Add POJO in the method arg as the dependency
	//view --> model
	@PostMapping("/add")
	public String processAddEmpForm(@ModelAttribute  
			Employee emp,HttpSession session) {
		// @ModelAttribute => data binding from req params --> server side object
		// SC creates instance of emp , calls pojo's setters -->  adds it as the model attribute
		System.out.println("in process add form "+emp);
		Long deptId = (Long) session.getAttribute("dept_id");
		//invoke service layer method
		session.setAttribute("message", empService.addNewEmp(deptId,emp));
		return "redirect:/employees/list?deptId=" + deptId;
	}
	//add a method for emp/mgr logout
	//URL : http://localhost:8080/spring_boot/employees/logout
	//method=GET
	@GetMapping("/logout")
	public String logout(Model map,HttpSession session)
	{
		System.out.println("in logout");
		//add emp details under model attribute
		map.addAttribute("emp_details", session.getAttribute("emp_dtls"));
		//invalidate Http Session
		session.invalidate();
		return "/emps/logout";
	}

}
