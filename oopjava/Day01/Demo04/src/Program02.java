import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int empid;
		String name;
		double salary;
		
		System.out.print("Enter empid - ");
		empid = sc.nextInt();
		
		System.out.print("Enter name - ");
		name = sc.next();
		
		System.out.print("Enter salary- ");
		salary = sc.nextDouble();
		
		System.out.println("Empid - " + empid);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);

	}

}
