package com.app.service;

import java.util.List;

import com.app.entities.Employee;

public interface EmployeeService {
	List<Employee> getAllEmps();

	Employee addEmpDetails(Employee emp);

	Employee getEmpDetails(Long empId);

	// add method to authenticate emp
	Employee authenticateEmployee(Employee emp);

}
