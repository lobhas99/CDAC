
public class Program03 {

	public static void main(String[] args) {
		int num1 = 20;
		Integer i1 = new Integer(num1); // Boxing
		Integer i2 = Integer.valueOf(num1); // Boxing
		
		Integer i3 = num1;  // Auto boxing
		System.out.println("i3 - "+i3);	
	}
}
