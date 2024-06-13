package demo04_methodref;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-08 11:55
 */

public class Demo04Main {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1, 34, 37, 32, 25, 41);
		// non-static method (println()) called on given object (System.out)
		//	givenObject::methodName i.e. System.out::println
		//list1.forEach(e -> System.out.println(e));
		list1.forEach(System.out::println);
		
		List<String> list2 = new ArrayList<String>();
		Collections.addAll(list2, "IND", "AUS", "NZ", "SA", "AFG");
		// non-static method (compareTo()) called on first arg (of type String) of lambda
		//	ClassName::methodName i.e. String::compareTo
		//list2.sort((x,y) -> x.compareTo(y));
		list2.sort(String::compareTo);
		System.out.println(list2);
		
		List<Double> list3 = new ArrayList<Double>();
		Collections.addAll(list3, 3.4, 3.7, 3.2, 2.5, 4.1);
		// static method (compare()) called on ClassName (Double)
		//	ClassName::methodName i.e. Double::compare
		//list3.sort((x,y) -> Double.compare(x, y));
		list3.sort(Double::compare);
		System.out.println(list3);
		
		// Paramless Constructor called of Class (Date)
		//	ClassName::new -> Date::new
		//Stream.generate(() -> new Date())
		Stream.generate(Date::new)
			.limit(10)
			.forEach(e -> System.out.println(e));
	}
}














