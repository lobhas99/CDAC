package com.sunbeam;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-08 15:07
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@interface Developer {
	String value();
	String designation() default "Developer";
	String company() default "Sunbeam";
}

@Developer(value="Nilesh G", designation="Sr Developer")
class MyClass {
	private int myField;
	// ...
	@Developer(value="Rahul S", designation="Sr Developer", company="Sunbeam Karad")
	public void myMethod() {
		
	}
}

@Developer("Amit K") // implicit attribute is "value"
class YourClass {
	@Developer(value="Amit")
	public void yourMethod() {
		
	}
}

public class Demo07Main {
	public static void main(String[] args) {
		Annotation[] anns = YourClass.class.getDeclaredAnnotations();
		for (Annotation ann : anns)
			System.out.println(ann);
		
		Developer devAnn = MyClass.class.getDeclaredAnnotation(Developer.class);
		System.out.println("Name: " + devAnn.value());
		System.out.println("Designation: " + devAnn.designation());
		System.out.println("Company: " + devAnn.company());
	}
}







