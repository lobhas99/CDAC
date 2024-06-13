package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-02 10:57
 */

public class Demo03Main {
	public static void main(String[] args) {
		List<String> list;
		//list = new ArrayList<String>();		
		//list = new LinkedList<String>();		
		list = new Vector<String>();			
		
		Collections.addAll(list, "IND", "AUS", "AFG", "SRI", "ENG", "NZ");
		System.out.println(list); // "IND", "AUS", "AFG", "SRI", "ENG", "NZ"
		
		Collections.sort(list); // String is Comparable.
		System.out.println(list); // "AFG", "AUS", "ENG", "IND", "NZ", "SRI"
		
		class StringDescComparator implements Comparator<String> {
			@Override
			public int compare(String s1, String s2) {
				int diff = - s1.compareTo(s2);
				return diff;
			}
		}
		Collections.sort(list, new StringDescComparator());
		System.out.println(list); // "SRI", "NZ", "IND", "ENG", "AUS", "AFG" 
		
		Collections.shuffle(list);
		System.out.println(list);
		
		list.sort(new StringDescComparator());
		System.out.println(list); // "SRI", "NZ", "IND", "ENG", "AUS", "AFG"
	}
}
















