package com.sunbeam;

import java.util.LinkedList;
import java.util.List;

public class HashTable {
	
	public class Entry{
		private int key;
		private String value;
		public Entry() {
			key = 0;
			value = "";
		}
		public Entry(int k, String val) {
			key = k;
			value = val;
		}
	}
	
	private int SIZE;
	private List<Entry> arr[];
	public HashTable(int size) {
		SIZE = size;
		arr = new List[SIZE];
		for(int i = 0 ; i < SIZE ; i++)
			arr[i] = new LinkedList<HashTable.Entry>();
	}
	
	public int h(int k) {
		return k % SIZE;
	}
	
	public void put(int key, String value) {
		//1. find slot for key
		int slot = h(key);
		
		//2. check if entry already exist
		if(!arr[slot].isEmpty()) {
			for(Entry e : arr[slot]) {
				if(e.key == key) {
					e.value = value;
					return;
				}
			}
		}
		//3. Create one new entry
		Entry e = new Entry(key, value);
		//4. add entry into linked list of corresponding slot
		arr[slot].add(e);
	}
	
	public String get(int key) {
		//1. find slot of key
		int slot = h(key);
		//2. check if entry already exist
		if(!arr[slot].isEmpty()) {
			for(Entry e : arr[slot]) {
				if(e.key == key) {
					return e.value;
				}
			}
		}
		//3. key is not found
		return null;
	}

}









