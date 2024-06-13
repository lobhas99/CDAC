package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.EmployeeDao;
import com.app.entities.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
//dep :
	@Autowired
	private EmployeeDao empDao;

	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmpDetails(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmpDetails(Long empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee authenticateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
