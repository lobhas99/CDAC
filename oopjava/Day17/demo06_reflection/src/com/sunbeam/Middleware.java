package com.sunbeam;

import java.lang.reflect.Method;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-08 12:51
 */

public class Middleware {
	static Object callMethod(String className, String methodName, Class[] argTypes, Object[] argValues) {
		try {
			// load the class and get its metadata
			Class c = Class.forName(className);
			// create object of that class
			Object obj = c.newInstance();
			// find method in the class with given arg types
			Method m = c.getDeclaredMethod(methodName, argTypes);
			// ensure that method is accessible
			m.setAccessible(true);
			// invoke that method on created object with given args and collect result
			Object result = m.invoke(obj, argValues);
				// result = obj.method(argValues);
			// return result
			return result;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

