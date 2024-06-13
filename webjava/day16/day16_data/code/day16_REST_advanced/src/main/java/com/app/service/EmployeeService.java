package com.app.service;

import java.time.LocalDate;
import java.util.List;

import com.app.dto.EmployeeDTO;
import com.app.dto.SigninRequest;
import com.app.entities.Employee;

public interface EmployeeService {
	List<Employee> getAllEmps();

	Employee addEmpDetails(Employee emp);

	Employee getEmpDetails(Long empId);

	// add method to authenticate emp
	EmployeeDTO authenticateEmployee(SigninRequest request);

	List<EmployeeDTO> getEmpsByCardDate(LocalDate cardDate);

	// get all emps : pagination
	List<EmployeeDTO> getAllEmployees(int pageNumber, int pageSize);

}
