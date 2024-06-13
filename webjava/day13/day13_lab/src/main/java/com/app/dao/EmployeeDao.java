package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {
	//add a finder : JPQL : select e from Employee e where e.dept.id=:id
	List<Employee> findByDeptId(Long departmentId);

}
