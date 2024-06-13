package com.app.tester;

import static com.app.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.app.dao.EmployeeDao;
import com.app.dao.EmployeeDaoImpl;
import com.app.entities.Employee;
import com.app.entities.EmploymentType;

public class RestoreEmpImage {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create dao instance
			EmployeeDao dao = new EmployeeDaoImpl();
			System.out.println("Enter emp id");
			Integer empId=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter image file path");			
			System.out.println(dao.restoreImage(empId, sc.nextLine()));
		} // JVM : sf.close() ---> DBCP : cleaned up !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
