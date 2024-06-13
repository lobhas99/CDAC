
public class Program04 {

	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		int num1 = i1.intValue();// Unboxing
				//object.methodname() -> non static
		int num2 = i1; // auto unboxing
		
		System.out.println("num1 - "+num1); 
		System.out.println("num2 - "+num2); 
		
	}

}
