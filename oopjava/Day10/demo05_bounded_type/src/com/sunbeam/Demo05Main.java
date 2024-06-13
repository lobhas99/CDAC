package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-31 12:13
 */

interface Displayable {
	void display();
}

class Person implements Displayable {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// ...
	@Override
	public void display() {
		System.out.printf("Name: %s, Age: %d\n", this.name, this.age);
	}
}

class Book implements Displayable {
	private String name;
	private double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	// ...
	@Override
	public void display() {
		System.out.printf("Name: %s, Price: %.2f\n", this.name, this.price);
	}
}

class Car {
	private String name;
	private double price;
	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}
	// ...
	public void display() {
		System.out.printf("Name: %s, Price: %.2f\n", this.name, this.price);
	}
}

// bounded type parameter
class Box<T extends Displayable> {
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}
	public void show() {
		obj.display();
	}
}

public class Demo05Main {
	public static void main(String[] args) {
		Box<Person> b1 = new Box<>();
		b1.set(new Person("Nilesh", 40));
		b1.show();
		
		Box<Book> b2 = new Box<>();
		b2.set(new Book("Atlas Shrugged", 763.39));
		b2.show();
		
		//Box<Car> b3 = new Box<>(); // compiler error
		
		//Box<String> b4 = new Box<>(); // compiler error
		
	}
}






