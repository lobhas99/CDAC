package com.app.dao;

import com.app.entities.Employee;

public interface EmployeeDao {
//add a method to save emp details in sepcified dept
	String addEmpToDepartment(Long deptId, Employee newEmp);

	// remove emp from specific dept
	String removeEmpFromDept(Long deptId, Long empId);

}
