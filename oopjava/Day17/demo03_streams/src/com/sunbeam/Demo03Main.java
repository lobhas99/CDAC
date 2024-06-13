package com.sunbeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-08 09:06
 */

public class Demo03Main {
	/*
	// collections instead of streams
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 6, 7, 9, 1, 3, 5, 4, 2, 8);
		// take odd numbers
		List<Integer> list2 = new ArrayList<Integer>();
		for(Integer e : list) {
			if(e % 2 != 0)
				list2.add(e);
		}
		// square of each number
		List<Integer> list3 = new ArrayList<Integer>();
		for(Integer e : list2)
			list3.add(e * e);
		// sort in asc order
		List<Integer> list4 = new ArrayList<Integer>(list3);
		list4.sort((x,y) -> x - y);
		// prefix with "DAC"
		List<String> list5 = new ArrayList<String>();
		for(Integer e : list4)
			list5.add("DAC" + e);
		// print all
		for (String ele : list5)
			System.out.println(ele);
	}
	*/
	
	/*
	// logical understanding of stream program flow
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 6, 7, 9, 1, 3, 5, 4, 2, 8);
		
		Stream<Integer> strm1 = list.stream(); // 6, 7, 9, 1, 3, 5, 4, 2, 8
		
		// take odd numbers
		Stream<Integer> strm2 = strm1.filter(e -> e % 2 != 0); // 7, 9, 1, 3, 5
		
		// square of each number
		Stream<Integer> strm3 = strm2.map(e -> e * e); // 49, 81, 1, 9, 25
		
		// sort in asc order
		Stream<Integer> strm4 = strm3.sorted((x,y) -> x - y); // 1, 9, 25, 49, 81
		
		// prefix with "DAC"
		Stream<String> strm5 = strm4.map(e -> "DAC" + e); // DAC1, DAC9, DAC25, DAC49, DAC81
		
		// print all
		strm5.forEach(e -> System.out.println(e));
	}
	*/

	/*
	// stream programming standard practice
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 6, 7, 9, 1, 3, 5, 4, 2, 8);

		list.stream()
			.filter(e -> e % 2 != 0)
			.map(e -> e * e)
			.sorted((x,y) -> x - y)
			.map(e -> "DAC" + e)
			.forEach(e -> System.out.println(e));
	}
	*/

	/*
	// understanding actual stream execution/internals
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 6, 7, 9, 1, 3, 5, 4, 2, 8);
		
		list.stream()
			.filter(e -> {
				System.out.println("filter(odd) : " + e);
				return e % 2 != 0;
			})
			.map(e -> {
				System.out.println("map(square) : " + e);
				return e * e;
			})
			.sorted((x,y) -> {
				System.out.println("compare() : " + x + " -- " + y);
				return x - y;
			})
			.map(e -> {
				System.out.println("map(prefix) : " + e);
				return "DAC" + e;
			})
			.forEach(e -> System.out.println("forEach() : " + e));
		
		System.out.println("Bye!");
	}
	*/
	
	/*
	// exploring few stream operations -- distinct(), limit(), skip()
	public static void main(String[] args) {		
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 6, 7, 9, 1, 3, 5, 4, 2, 8, 7, 2, 5, 6, 1, 7, 3, 2, 1, 6);
		
		list.stream()
			.distinct()
			.sorted()
			.skip(3)
			.limit(5)
			.forEach(e -> System.out.println(e));
	}
	*/
	
	/*
	// advanced stream operations -- reduce()
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 6, 7, 9, 1, 3, 5, 4, 2, 8);

		Integer result = list.stream()
			.reduce(0, (a,e) -> a + e);
		
		System.out.println("Result: " + result);
	}
	*/
	/*
	// advanced stream operations -- collect()
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 6, 7, 9, 2, 1, 3, 5, 4, 2, 8);

		List<Integer> result1 = list.stream()
			.filter(e -> e % 2 == 0)
			.collect(Collectors.toList());
		
		System.out.println(result1); // list of all even numbers
		
		Set<Integer> result2 = list.stream()
			.filter(e -> e % 2 == 0)
			.collect(Collectors.toSet());
		
		System.out.println(result2); // list of all unique even numbers
		
		Map<Integer, String> result3 = list.stream()
			.distinct()
			.collect( Collectors.toMap(e -> e, e -> e%2==0?"Even":"Odd") );
	
		result3.forEach((k,v) -> System.out.println(k + " -- " + v));
	}
	*/
	/*
	// advanced stream operations -- flatMap()
	public static void main(String[] args) {
		Stream<String> strm = Stream.of("A,B,C,D", "X,Y");
		
		strm
			.flatMap(e -> Stream.of( e.split(",") ))
			.forEach(e -> System.out.println(e));
	}
	*/
	
	// stream creation 
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1, 6, 7, 9, 2);
		
		System.out.println("\nStream from collection: ");
		list1.stream()
			.forEach(e -> System.out.println(e));
		
		System.out.println("\nStream from array using Stream.of(): ");
		Integer[] arr2 = { 6, 7, 9, 2 };
		Stream.of(arr2)
			.forEach(e -> System.out.println(e));

		System.out.println("\nStream from array using Arrays.stream(): ");
		Integer[] arr3 = { 6, 7, 9, 2 };
		Arrays.stream(arr3)
			.forEach(e -> System.out.println(e));
		
		System.out.println("\nStream from array using Stream.iterate(): ");
		Stream.iterate(1, x -> x + 1)
			.limit(6)
			.forEach(e -> System.out.println(e));
		
		
		System.out.println("\nStream from array using Stream.generate(): ");
		Stream.generate(() -> Math.random())
			.limit(10)
			.forEach(e -> System.out.printf("%.4f\n", e));
		
		System.out.println("\nStream of Primitive types: ");
		IntSummaryStatistics stats = IntStream.rangeClosed(1, 10)
			.summaryStatistics();
		System.out.println(stats);
	}
}






























