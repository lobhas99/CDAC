package com.sunbeam;

import java.util.function.BinaryOperator;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-04 11:19
 */

public class Demo04Main {
	public static void calculate(Double a, Double b, BinaryOperator<Double> op) {
		Double result = op.apply(a, b);
		System.out.println("Result: " + result);
	}
	public static void main(String[] args) {
		// non-capturing lambdas
		// output depends on its inputs only
		calculate(22.0, 7.0, (x,y) -> x / y);
		
		calculate(22.0, 7.0, (x,y) -> x * y);
		
		calculate(22.0, 7.0, (x,y) -> x + y);
		
		// capturing lambdas --> closures
		// output depends on its inputs as well as additional captured values
		//	"number" is captured in lambda expression
		//	captured value must be final or effectively final.
		int number = 21;
		calculate(22.0, 7.0, (x,y) -> x + y + number);
	}
}




