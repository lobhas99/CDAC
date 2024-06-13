package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DepartmentDao;
import com.app.pojos.Department;

@Service // to tell SC follwoing class contains B.L
@Transactional // to tell SC , use spring supplied Tx mgr bean to auto manage txs
public class DepartmentServiceImpl implements DepartmentService {
	//depcy : dao i/f
	@Autowired
	private DepartmentDao deptDao;

	@Override
	public List<Department> getAllDepartments() {
		
		return deptDao.findAll();
	}

}
