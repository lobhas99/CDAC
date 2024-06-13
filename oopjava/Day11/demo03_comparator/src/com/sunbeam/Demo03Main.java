package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-01 10:34
 */

////pre-defined interface: java.util.Comparator -- till Java 1.4 (not type-safe)
//interface Comparator {
//	int compare(Object obj1, Object obj2);
//}

////pre-defined interface: java.util.Comparator -- since Java 5.0 (type-safe)
//interface Comparator<T> {
//	int compare(T obj1, T obj2);
//}

class Person implements Comparable<Person> {
	private String name;
	private int age;
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public int compareTo(Person other) {
		int diff = this.age - other.age;	// asc sort by age
		return diff;
	}
}

public class Demo03Main {
	public static void main(String[] args) {
		Person[] arr = {
				new Person("Bond", 60),
				new Person("Superman", 45),
				new Person("Spiderman", 30),
				new Person("Shaktiman", 70),
				new Person("Ironman", 50)
			};	
		System.out.println("Before Sort: ");
		for(Person p:arr)
			System.out.println(p);

		// compare Person by name (asc)
		class PersonNameComparator implements Comparator<Person> {
			@Override
			public int compare(Person p1, Person p2) {
				int diff = p1.getName().compareTo(p2.getName());
				return diff;
			}
		}
		PersonNameComparator nameComparator = new PersonNameComparator();
		Arrays.sort(arr, nameComparator);
		
		System.out.println("After Sort (by name asc): ");
		for(Person p:arr)
			System.out.println(p);
		
		// compare Person by age (desc)
		class PersonAgeDescComparator implements Comparator<Person> {
			@Override
			public int compare(Person p1, Person p2) {
				int diff = p1.getAge() - p2.getAge();
				return -diff;
			}
		}
		PersonAgeDescComparator ageDescComparator = new PersonAgeDescComparator();
		Arrays.sort(arr, ageDescComparator);
		
		System.out.println("After Sort (by age desc): ");
		for(Person p:arr)
			System.out.println(p);
	}
}















