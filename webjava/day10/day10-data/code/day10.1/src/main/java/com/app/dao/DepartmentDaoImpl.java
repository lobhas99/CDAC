package com.app.dao;

import com.app.entities.Department;
import org.hibernate.*;
import static com.app.utils.HibernateUtils.getFactory;

public class DepartmentDaoImpl implements DepartmentDao {

	@Override
	public String addNewDepartment(Department newDept) {
		String mesg = "Adding dept failed...";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			session.persist(newDept);
			tx.commit();
			mesg = "added new dept with id " + newDept.getId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public Department getDepartmentDetails(String deptName) {
		Department dept = null;
		String jpql = "select d from Department d where d.deptName=:nm";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			dept = session.createQuery(jpql, Department.class)
					.setParameter("nm", deptName)
					.getSingleResult();
					tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return dept;
	}
	@Override
	public Department getDepartmentAndEmpDetails(String deptName) {
		Department dept = null;
		String jpql = "select d from Department d left join fetch d.employees  where d.deptName=:nm";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			dept = session.createQuery(jpql, Department.class)
					.setParameter("nm", deptName)
					.getSingleResult();
			//dept : persistent
			//simply invoke size() 
	//		dept.getEmployees().size();//Hint to hibernate
					tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return dept;
	}


}
