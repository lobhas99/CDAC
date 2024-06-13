package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Department;


@Repository //to tell SC following is spring bean containing data access logic
public class DepartmentDaoImpl implements DepartmentDao {
	//depcy
	@Autowired //byType OR JPA annotation @PersistenceContext
	private EntityManager mgr;

	@Override
	public List<Department> getAllDepartments() {
		String jpql="select d from Department d";
		return mgr
				.createQuery(jpql, Department.class)
				.getResultList();
	}

}
