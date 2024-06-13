package com.sunbeam;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-03 09:12
 */

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
	public int hashCode() {
		int hash = Objects.hash(this.id);
		return hash;
	}
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		if(this == o)
			return true;
		if(o instanceof Employee) {
			Employee other = (Employee) o;
			if(Objects.equals(this.id, other.id))
				return true;
		}
		return false;
	}
	@Override
	public int compareTo(Employee other) {
		int diff = Integer.compare(this.id, other.id);
		return diff;
	}
}

public class Demo03Main {
	public static void main(String[] args) {
		//Set<Employee> set = new HashSet<Employee>();	// duplicate on equals() + hashCode()
		//Set<Employee> set = new LinkedHashSet<Employee>();	// duplicate on equals() + hashCode()
		//Set<Employee> set = new TreeSet<Employee>();	// duplicate on Comparable.compareTo()
		
		class EmpSalComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = Double.compare(e1.getSal(), e2.getSal());				
				return diff;
			}
		}
		Set<Employee> set = new TreeSet<Employee>(new EmpSalComparator()); // duplicate on Comparator.compare()
		
		Collections.addAll(set, 
			new Employee(777, "Nilesh", "Training", 30000.0),
			new Employee(333, "Nilesh", "Training", 50000.0),
			new Employee(666, "Rajiv", "Training", 40000.0),
			new Employee(222, "Nitin", "Mangement", 70000.0),
			new Employee(444, "Prashant", "Mangement", 65000.0),
			new Employee(555, "Prashant", "Accounts", 50000.0)
		);
		
		set.add(new Employee(222, "Nitin", "", 0.0));
		
		for(Employee e : set)
			System.out.println(e);
	}
}














