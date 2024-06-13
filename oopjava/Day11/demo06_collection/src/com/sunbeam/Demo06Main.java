package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-01 12:54
 */

// Copied from "demo04"
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

public class Demo06Main {
	public static void main(String[] args) {
		Collection<Employee> c = new ArrayList<Employee>();
		
		c.add(new Employee(7, "Nilesh", "Training", 30000.0));
		c.add(new Employee(3, "Nilesh", "Training", 50000.0));
		c.add(new Employee(6, "Rajiv", "Training", 40000.0));
		c.add(new Employee(2, "Nitin", "Mangement", 70000.0));
		c.add(new Employee(4, "Prashant", "Mangement", 65000.0));
		c.add(new Employee(5, "Prashant", "Accounts", 35000.0));

		Iterator<Employee> itr = c.iterator();
		while(itr.hasNext()) {
			Employee ele = itr.next();
			System.out.println(ele.toString());
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp id to be searched: ");
		int id = sc.nextInt();
		Employee key = new Employee();
		key.setId(id);
		if(c.contains(key)) // internally calls key.equals(ele) -- if overridden correctly then only contains() work well.
			System.out.println("Emp found.");
		else
			System.out.println("Emp not found.");
	}
}

















