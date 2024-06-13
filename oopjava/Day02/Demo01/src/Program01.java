
public class Program01 {

	public static void main(String[] args) {
		int num1 = 10;
		double num2 = num1; // Widening
		
		double num3 = 123.45;
		int num4 = (int)num3; // Narrowing
		System.out.println(num4); 
		
		boolean status = true;
		
		//int num5 = (int)status; // Not Allowed 
		//char ch = (char)status; // Not Allowed
	
		char ch = 'a';
		int num5 = ch; //  Type change
		
		byte b1 = 20;
		char ch2 = (char)b1; // Type Changes
	}

}
