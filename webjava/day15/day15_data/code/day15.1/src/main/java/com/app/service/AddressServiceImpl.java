package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AddressDao;
import com.app.dao.EmployeeDao;
import com.app.pojos.Address;
import com.app.pojos.Employee;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressDao adrDao;
	
	@Autowired
	private EmployeeDao empDao;

	@Override
	public String assignEmpAddress(Long empId, Address adr) {
		// get emp by it's id
		Employee emp=empDao.getReferenceById(empId);
		System.out.println(emp.getClass());//use case of lazy loading
		adr.setEmp(emp);
		adrDao.save(adr);
		return "Assigned address to emp ";
	}

}
