package com.sunbeam;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-08 12:27
 */

public class Demo05Main {
	public static void main(String[] args) throws Exception {
		// Class c = Class.forName("pkg.ClassName");
		// Class c = ClassName.class;
		// Class c = obj.getClass();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter class name: ");
		String className = sc.nextLine();

		Class c = Class.forName(className);
		System.out.println("Class Name: " + c.getName());
		
		System.out.println("Super Class: " + c.getSuperclass().getName());
		
		Class[] intfClses = c.getInterfaces();
		for (Class ic : intfClses)
			System.out.println("Super Interface: " + ic.getName());
	
		Field[] fields = c.getDeclaredFields();
		for (Field f : fields)
			System.out.println("Field: " + f.toString());
		
		Method[] methods = c.getDeclaredMethods();
		for (Method m : methods)
			System.out.println("Method: " + m.toString());
		
 		Constructor[] ctors = c.getDeclaredConstructors();
 		for (Constructor ctor : ctors)
 			System.out.println("Constructor: " + ctor.toString());
 		
 		Annotation[] anns = c.getDeclaredAnnotations();
 		for (Annotation ann : anns)
			System.out.println(ann);
 	}
}










