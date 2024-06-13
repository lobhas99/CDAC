
public class Program02 {

	public static void main(String[] args) {
		System.out.println("Size = "+ Integer.SIZE);
		System.out.println("Bytes = "+ Integer.BYTES);
		System.out.println("Max Value = "+ Integer.MAX_VALUE);
		System.out.println("Min Value = "+ Integer.MIN_VALUE);
		
		int result = Integer.sum(10, 20);
					// classname.methodname() -> static
		System.out.println("Addition = "+ result);
	}

}
