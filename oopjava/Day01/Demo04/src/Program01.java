import java.io.Console;

// It cannot execute in STS
// It will throw an exception NULLPointerException
// To execute this program successfully use terminal
public class Program01 {

	public static void main(String[] args) {
		String name;
		String mobile;
	
		Console console = System.console();
		
		System.out.print("Enter the name - ");
		name = console.readLine();
		System.out.print("Enter the mobile - ");
		mobile =  console.readLine();
		
		System.out.println("Name - "+name);
		System.out.println("Mobile - "+mobile);
		
	}

}
