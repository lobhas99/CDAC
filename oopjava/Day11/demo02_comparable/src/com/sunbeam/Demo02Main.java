package com.sunbeam;

import java.util.Arrays;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-01 09:23
 */

/*
public class Demo02Main {
	public static void main(String[] args) {
		int[] arr = { 33, 55, 77, 22, 44 };
		System.out.println("Before sort: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(" After sort: " + Arrays.toString(arr));
	}
}
*/

/*
public class Demo02Main {
	public static void main(String[] args) {
		double[] arr = { 3.3, 5.5, 7.7, 2.2, 4.4 };
		System.out.println("Before sort: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(" After sort: " + Arrays.toString(arr));
	}
}
*/

/*
//// pre-defined interface -- java.lang.Comparable -- till Java 1.4 (not type-safe)
//interface Comparable {
//	int compareTo(Object other);
//		// returns difference between "this" object and "other" object.
//		// 	0 is both are same
//		// +ve if "this" > "other"
//		// -ve if "this" < "other"
//}

class Person implements Comparable {
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
	public int compareTo(Object o) {
		Person other = (Person) o;
	//	System.out.println("Comparing: " + this + " AND " + other);
		int diff = this.age - other.age;
			//int diff = Integer.compare(this.age, other.age);
		return diff;
	}
}

public class Demo02Main {
	public static void main(String[] args) {
		Object[] arr = {
			new Person("Bond", 60),
			new Person("Superman", 45),
			new Person("Spiderman", 30),
		//	"He-man",					// application fails with ClassCastException i.e. not type-safe
			new Person("Shaktiman", 70),
			new Person("Ironman", 50)
		};	
		System.out.println("Before Sort: ");
		for(Object p:arr)
			System.out.println(p);
		Arrays.sort(arr);
			// will raise ClassCastException if Person is not Comparable.
			// will sort array if Person is Comparable
		
		System.out.println("AfterSort: ");
		for(Object p:arr)
			System.out.println(p);
	}
}
*/

////pre-defined interface -- java.lang.Comparable -- since Java 5.0 (type-safe)
//interface Comparable<T> {
//	int compareTo(T other);
//		// returns difference between "this" object and "other" object.
//		// 	0 is both are same
//		// +ve if "this" > "other"
//		// -ve if "this" < "other"
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
		//	System.out.println("Comparing: " + this + " AND " + other);
		int diff = this.age - other.age;				// asc sort by age
		//int diff = Integer.compare(this.age, other.age);
		//int diff = this.name.compareTo(other.name);	// asc sort by name
		return diff;
	}
}

public class Demo02Main {
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
		Arrays.sort(arr);
			// will raise ClassCastException if Person is not Comparable.
			// will sort array if Person is Comparable
		
		System.out.println("AfterSort: ");
		for(Person p:arr)
			System.out.println(p);
	}
}











