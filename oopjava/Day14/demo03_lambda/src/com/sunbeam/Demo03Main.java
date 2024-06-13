package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-04 10:25
 */

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

public class Demo03Main {
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

		// local class
		class EmpIdAscComparator implements Comparator<Employee> {
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getId() - e2.getId();
				return diff;
			}
		}

		list.sort(new EmpIdAscComparator());
		
		System.out.println("\nSort by Id ASC: ");
		for (Employee e : list)
			System.out.println(e);
		
		// anonymous object of anonymous class
		list.sort(new Comparator<Employee>() { 
			@Override
			public int compare(Employee e1, Employee e2) {
				int diff = e1.getName().compareTo(e2.getName());
				return diff;
			}
		});

		System.out.println("\nSort by Name ASC: ");
		for (Employee e : list)
			System.out.println(e);
		
		// lambda expr - multiline - arg types given
		list.sort((Employee e1, Employee e2) -> {
			int diff = e1.getDept().compareTo(e2.getDept());
			return diff;
		});
		
		System.out.println("\nSort by Dept ASC: ");
		for (Employee e : list)
			System.out.println(e);
		
		// lambda expr - multiline - arg types inferred
		list.sort((e1,e2) -> {
			int diff = - e1.getDept().compareTo(e2.getDept());
			return diff;
		});
		
		System.out.println("\nSort by Dept DESC: ");
		for (Employee e : list)
			System.out.println(e);
		
		// lambda expr - single line (with block) - arg types inferred
		list.sort((e1,e2) -> {
			return - e1.getName().compareTo(e2.getName());
		});
		
		System.out.println("\nSort by Name DESC: ");
		for (Employee e : list)
			System.out.println(e);

		// lambda expr - single line - arg types inferred
		list.sort((e1,e2) -> Double.compare(e1.getSal(), e2.getSal()) );
		
		System.out.println("\nSort by Sal ASC: ");
		for (Employee e : list)
			System.out.println(e);

		list.sort((e1,e2) -> - Double.compare(e1.getSal(), e2.getSal()));
		
		System.out.println("\nSort by Sal DESC: ");
		for (Employee e : list)
			System.out.println(e);

		System.out.println("\nTraverse List using forEach() method.");
		list.forEach(e -> System.out.println(e));
		
		System.out.println("\nDeleting employees with Sal > 45000");
		list.removeIf(e -> e.getSal() > 45000);
		list.forEach(e -> System.out.println(e));
		
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(400027, "Byculla Mumbai");		// returns null 
		map.put(411037, "Marketyard Pune");		// returns null
		map.put(411002, "Bajirao Rd Pune");		// returns null
		map.put(411052, "Hinjawadi Pune");		// returns null
		map.put(415110, "ST Stand Karad");		// returns null
		map.put(411046, "Katraj Pune");			// returns null
		map.put(411007, "Aundh Pune");			// returns null

		System.out.println("\nTraversing map using forEach(): ");
		map.forEach((k,v) -> System.out.println(k + " -- " + v));
	}
}


















