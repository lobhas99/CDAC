package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-04 09:20
 */

// Employee.class
class Employee {
	private int id;
	private String name;
	private String dept;
	private double sal;
	public Employee() {
	}
	public Employee(int id, String name, String dept, double sal) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + "]";
	}
}

// Demo02Main.class
public class Demo02Main {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		
		Collections.addAll(list, 
			new Employee(777, "Nilesh", "Training", 30000.0),
			new Employee(333, "Nilesh", "Training", 50000.0),
			new Employee(666, "Rajiv", "Training", 40000.0),
			new Employee(222, "Nitin", "Mangement", 70000.0),
			new Employee(444, "Prashant", "Mangement", 65000.0),
			new Employee(555, "Prashant", "Accounts", 50000.0)
		);

		// local class --> Demo02Main$1EmpIdComparator.class
		class EmpIdComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getId() - e2.getId();
				return diff;
			}
		}

		list.sort(new EmpIdComparator());
		System.out.println("\nSort by Id: ");
		for (Employee e : list)
			System.out.println(e);
		
		// anonymous inner class --> Demo02Main$1.class
		Comparator<Employee> empNameComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getName().compareTo(e2.getName());
				return diff;
			}
		};
	
		list.sort(empNameComparator);
		System.out.println("\nSort by Name: ");
		for (Employee e : list)
			System.out.println(e);
	
		// anonymous object of anonymous inner class --> Demo02Main$2.class
		list.sort(new Comparator<Employee>() { 
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getDept().compareTo(e2.getDept());
				return diff;
			}
		});
		
		System.out.println("\nSort by Dept: ");
		for (Employee e : list)
			System.out.println(e);
	
		// local class
		class MyClass {
			public void test() {
				System.out.println("MyClass.test() called");
			}
		}
		
		// call test() on anonymous object of MyClass.
		new MyClass().test();
		
		// call test() on anonymous object of anonymous class inherited from MyClass. --> Demo02Main$3.class
		new MyClass() {
			public void test() {
				System.out.println("Anonymous.test() called");
			}
		}.test();
	}
}
























