package com.sunbeam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-03 11:28
 */

public class Demo05Main {
	//key=pin code (Integer), value=region (String)
	public static void main(String[] args) {
		Map<Integer, String> map;
		map = new HashMap<Integer, String>();
		//map = new LinkedHashMap<Integer, String>();
		//map = new TreeMap<Integer, String>();
		//map = new Hashtable<Integer, String>();
		
		map.put(400027, "Byculla Mumbai");		// returns null 
		map.put(411037, "Marketyard Pune");		// returns null
		map.put(411002, "Bajirao Rd Pune");		// returns null
		map.put(411052, "Hinjawadi Pune");		// returns null
		map.put(415110, "ST Stand Karad");		// returns null
		map.put(411046, "Katraj Pune");			// returns null
		map.put(411007, "Aundh Pune");			// returns null
		
		map.put(411002, "Shanipar Pune");		// returns "Bajirao Rd Pune" (old value)
		System.out.println("Size: " + map.size()); // 7
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter pin: ");
		int pin = sc.nextInt();
		
		String region = map.get(pin);
		if(region == null)
			System.out.println("Not found");
		else
			System.out.println("Region: " + region);
		
		region = map.getOrDefault(pin, "NOT FOUND");
		System.out.println("Region: " + region);
		*/
		
		/*
		Set<Integer> keys = map.keySet();
		System.out.println("KEYS: " + keys);
		
		Collection<String> values = map.values();
		System.out.println("VALUES: " + values);
		*/
		
		Set< Entry<Integer,String> > entries = map.entrySet();
		for(Entry<Integer,String> en : entries) {
			System.out.println(en.getKey() + " -- " + en.getValue());
		}
	}
}


























