package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-01 10:55
 */

// POJO class = Plain Old Java Object = fields + constructor + getter/setter + toString() - business logic
class Employee implements Comparable<Employee> {
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
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		if(this == o)
			return true;
		if(o instanceof Employee) {
			Employee other = (Employee) o;
			if(this.id == other.id)
				return true;
		}
		return false;
	}
	// conventionally, natural ordering should be consistent with equals()
	@Override
	public int compareTo(Employee other) {
		int diff = Integer.compare(this.id, other.id);
		return diff;
	}
}

public class Demo04Main {
	public static void main(String[] args) {
		Employee[] arr = new Employee[] {
			new Employee(7, "Nilesh", "Training", 30000.0),
			new Employee(3, "Nilesh", "Training", 50000.0),
			new Employee(6, "Rajiv", "Training", 40000.0),
			new Employee(2, "Nitin", "Mangement", 70000.0),
			new Employee(4, "Prashant", "Mangement", 65000.0),
			new Employee(5, "Prashant", "Accounts", 35000.0),
		};
		
		// SELECT * FROM emp ORDER BY name DESC
		class EmpNameDescComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = - e1.getName().compareTo(e2.getName());
				return diff;
			}
		}
		
		Arrays.sort(arr, new EmpNameDescComparator());
		System.out.println("After Sort by name DESC");
		for (Employee e : arr)
			System.out.println(e);
		
		// SELECT * FROM emp ORDER BY sal ASC
		class EmpSalAscComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = Double.compare(e1.getSal(), e2.getSal());
				return diff;
			}
		}
		Arrays.sort(arr, new EmpSalAscComparator());
		System.out.println("After Sort by sal ASC");
		for (Employee e : arr)
			System.out.println(e);
		
		// SELECT * FROM emp ORDER BY dept ASC, sal DESC
		class EmpDeptAscSalDescComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getDept().compareTo(e2.getDept());
				if(diff == 0)
					diff = - Double.compare(e1.getSal(), e2.getSal());
				return diff;
			}
		}
		
		Arrays.sort(arr, new EmpDeptAscSalDescComparator());
		System.out.println("After Sort by dept ASC, sal DESC");
		for (Employee e : arr)
			System.out.println(e);
		
		// SELECT * FROM emp ORDER BY dept DESC, name ASC, sal DESC
		class CustomEmpComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = - e1.getDept().compareTo(e2.getDept());
				if(diff == 0)
					diff = e1.getName().compareTo(e2.getName());
				if(diff == 0)
					diff = - Double.compare(e1.getSal(), e2.getSal());
				return diff;
			}
		}
		
		Arrays.sort(arr, new CustomEmpComparator());
		System.out.println("After Sort by dept DESC, name ASC, sal DESC");
		for (Employee e : arr)
			System.out.println(e);
	}
}
























