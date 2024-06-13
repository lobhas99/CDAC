package com.sunbeam;

public class Program02 {
	
	// Not a variable arity method
	public static void add(int []args) {
		int result = 0;
		for(int element: args)
			result= result + element;
		
		System.out.println("Addition = "+ result);
	}
	
	public static void main(String[] args) {
		int arr[] =  {10,20,30,40,50};
		add(arr);
		add(new int[]{10,20,30,40});
		//add(10,20,30);// NOT allowed
	}

}
