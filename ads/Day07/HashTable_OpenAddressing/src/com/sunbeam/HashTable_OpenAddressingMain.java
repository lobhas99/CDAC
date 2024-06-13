package com.sunbeam;

public class HashTable_OpenAddressingMain {

	public static void main(String[] args) {
		HashTable tbl = new HashTable(10);
		
		tbl.put(8, "v1");
		tbl.put(3, "v2");
		tbl.put(10, "v3");
		tbl.put(4, "v4");
		tbl.put(6, "v5");
		tbl.put(13, "v6");
		tbl.put(4, "v");
		
		String ret = tbl.get(4);
		if(ret == null)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found and value : " + ret);
		

	}

}



