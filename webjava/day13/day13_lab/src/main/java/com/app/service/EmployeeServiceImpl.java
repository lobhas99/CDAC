package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DepartmentDao;
import com.app.dao.EmployeeDao;
import com.app.pojos.Department;
import com.app.pojos.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	// depcy
	@Autowired
	private EmployeeDao empDao;

	@Autowired
	private DepartmentDao deptDao;

	@Override
	public List<Employee> getEmpsByDepartment(Long deptId) {
		// TODO Auto-generated method stub
		return empDao.findByDeptId(deptId);
	}

	@Override
	public String deleteEmpDetails(Long deptId, Long empId) {
		// get dept details from it's id
		Department dept = deptDao.findById(deptId).orElseThrow();
		// get emp details from it's id
		// java.util.Optional class API :
		// T orElseThrow() : rets T or else throws NoSuchElementExc.
		Employee emp = empDao.findById(empId).orElseThrow();
		// dept n emp : PERSISTENT
		dept.removeEmployee(emp);
		return "Emp details deleted ....";
	} // Spring supplied Tx mgr bean will auto tx.commit : at the end of the
		// @Transactional method

}
