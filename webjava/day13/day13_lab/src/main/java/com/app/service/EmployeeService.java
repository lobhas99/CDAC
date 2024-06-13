package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface EmployeeService {
//add a method to get list of emps for specific dept
	List<Employee> getEmpsByDepartment(Long deptId);

	String deleteEmpDetails(Long deptId, Long empId);
}
