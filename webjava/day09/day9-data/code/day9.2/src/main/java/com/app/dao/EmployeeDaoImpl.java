package com.app.dao;

import static com.app.utils.HibernateUtils.getFactory;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.Department;
import com.app.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String addEmpToDepartment(Long deptId, Employee emp) {
		// emp : TRANSIENT (exists ONLY in heap)
		String mesg = "adding emp details failed !!!!";
		// 1. Get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			// get dept from it's id
			Department dept = session.get(Department.class, deptId);
			if (dept != null) {// dept : persistent
								// establish bi dir link
				dept.addEmployee(emp);
				// def val of casacade=none
				// so prog MUST explicitly persist emp details
				// session.persist(emp);
			}
			tx.commit();// hib performs dirty checking ---> checks cascading : ALL --> includes save
						// operation--inserts emp rec auto ,
			// w/o explicitl calling session.persist(emp)
			mesg = "Added new emp with ID=" + emp.getId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return mesg;
	}

	@Override
	public String removeEmpFromDept(Long deptId, Long empId) {
		String mesg = "removing emp details failed!!!!";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			// 3. get dept from it's id
			Department dept = session.get(Department.class, deptId);
			// 4. get emp from it's id
			Employee emp = session.get(Employee.class, empId);
			if (dept != null && emp != null) {
				// simply call helper method to remove bi dir asso.
				dept.removeEmployee(emp);//modofying the sate of the persistent entity !
				mesg = "removed emp " + emp.getLastName() + " from dept " + dept.getDeptName();
			}
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

}
