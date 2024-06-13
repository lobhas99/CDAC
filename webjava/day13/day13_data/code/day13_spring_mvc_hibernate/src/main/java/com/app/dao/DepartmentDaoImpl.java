package com.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;
import org.hibernate.*;

@Repository //to tell SC following is spring bean containing data access logic
public class DepartmentDaoImpl implements DepartmentDao {
	//depcy
	@Autowired //byType
	private SessionFactory factory;

	@Override
	public List<Department> getAllDepartments() {
		String jpql="select d from Department d";
		return factory.getCurrentSession()
				.createQuery(jpql, Department.class)
				.getResultList();
	}

}
