package com.app.dao;

import com.app.entities.Department;

public interface DepartmentDao {
//add a method to add new dept
	String addNewDepartment(Department newDept);

	// get department details
	Department getDepartmentDetails(String deptName);

	// get department and emp details
	Department getDepartmentAndEmpDetails(String deptName);
}
