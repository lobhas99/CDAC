package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
	// dep :
	@Autowired // (required = true)
	private EmployeeService empService;	

	public EmployeeController() {
		System.out.println("in ctor of " + getClass());
	}

	// REST API end point
	// URL : http://localhost:8080/employees/
	// Method : GET
	// resp : List<Emp>
	@GetMapping
	public List<Employee> listAllEmps() {
		System.out.println("in list all emps");
		return empService.getAllEmps();
	}

	// URL : http://localhost:8080/employees/
	// Method : POST
	// Payload : deptId + emp details 
	// Resp : Emp resp 
	@PostMapping
	public Employee addEmpDetails(@RequestBody  Employee emp) {
		System.out.println("in add emp " + emp);
		return empService.addEmpDetails(emp);
	}

	// URL : http://localhost:8080/employees/empId
	// Method : GET
	// resp : detached emp or exc
	@GetMapping("/{empId}")
	public Employee getEmpDetails(@PathVariable Long empId) {
		System.out.println("in get emp dtls " + empId);
		return empService.getEmpDetails(empId);
	}

	
	// URL : http://localhost:8080/employees/signin
	// Method : POST
	// payload : emp req 
	// resp in case of success :  SC 200 + emp details
	// resp in case of failure : api resp SC 404
	}
