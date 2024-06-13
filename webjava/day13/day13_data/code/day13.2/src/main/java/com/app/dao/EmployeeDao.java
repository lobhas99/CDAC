package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
	//add a finder 
	List<Employee> findByDeptId(Long departmentId);

}
