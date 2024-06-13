package com.sunbeam;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-27 12:29
 */

class SuperClass {
	public void method1() throws IOException {
		
	}
	public void method2() throws IOException {
		
	}
	public void method3() throws IOException, SQLException {
		
	}
	public void method4() throws IOException {
		
	}
}

class SubClass extends SuperClass {
	public void method1() throws IOException {
		
	}	
	public void method2() throws FileNotFoundException, EOFException {
		
	}	
	// compiler error
	//public void method3() throws IOException, InterruptedException {
	//
	//}
	// compiler error
	//public void method4() throws Exception {
	//	
	//}
}

public class Demo04Main {

	public static void main(String[] args) {

	}

}
