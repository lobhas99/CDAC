package com.sunbeam;

public class HashTable {
	public class Entry{
		private int key;
		private String value;
		public Entry() {
			key = 0;
			value = "";
		}
		public Entry(int k, String v) {
			key = k;
			value = v;
		}
	}
	
	private int SIZE;
	private Entry arr[];
	public HashTable(int size) {
		SIZE = size;
		arr = new Entry[SIZE];
	}
	
	public int h(int k) {
		return k % SIZE;
	}
	public int h(int k, int i) {
		return (h(k) + i) % SIZE;
	}
	
	public void put(int key, String value) {
		//1. find slot for key
		int slot = h(key);
		int i = 1;
		
		//2. if slot is not empty, probe for next slot
		while(arr[slot] != null) {
			//2.1 if same key is found, replace old value
			if(arr[slot].key == key) {
				arr[slot].value = value;
				return;
			}
			//2.2 if key is different, collision has occured, find next slot
			slot = h(key, i++);
		}
		
		//3. create one new entry
		Entry e = new Entry(key, value);
		//4. add entry into table slot
		arr[slot] = e;
	}
	
	
	public String get(int key) {
		//1. find slot for key
		int slot = h(key);
		int i = 1;
		
		//2. if slot is not empty, probe for next slot
		while(arr[slot] != null) {
			//2.1 if same key is found, replace old value
			if(arr[slot].key == key) {
				return arr[slot].value;
			}
			//2.2 if key is different, collision has occured, find next slot
			slot = h(key, i++);
		}
		//3. if key is not present
		return null;
	}

}








