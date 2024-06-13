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

	@Override
	public String updateEmpDetails(Long empId, double salary) {
		// get emp details by it's id
		Employee emp=empDao.findById(empId).orElseThrow();
		//emp : persistent
		emp.setSalary(salary);
		return "emp salary updated...";
	}

	@Override
	public String addNewEmp(Long deptId, Employee emp) {
		// get dept details from it's id
		Department dept=deptDao.findById(deptId).orElseThrow();
		//dept : persistent
		dept.addEmployee(emp);
		return "Added new emp ....";
	}
	/*
	 * When @Transactional method rets 
	 * Spring suppled Tx mgr chks for un chked(RuntimeExc) 
	 * --yes --rollback
	 * no -- tx.commit --session.flush() --dirty chking --insert emp rec--
	 * session.close --L1 cache destroyed n db cn(Hikari) rets to the pool
	 */

	@Override
	public Employee authenticateEmp(String em, String pass) {
		return empDao.findByEmailAndPassword(em, pass).orElseThrow();
	}
	
	
	
	
	
	

}
