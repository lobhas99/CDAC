import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		int choice;
		int num;
		Scanner sc = new Scanner(System.in);

		System.out.println("0. EXIT");
		System.out.println("1. Positive or Negative");
		System.out.println("2. No is Prime or not");
		System.out.print("Enter your choice - ");
		choice = sc.nextInt();

		switch (choice) {
		case 0:
			System.out.println("Bye...");
			break;

		case 1:
			System.out.print("Enter the number - ");
			num = sc.nextInt();
			if (num > 0)
				System.out.println("Number is positive");
			else if (num < 0)
				System.out.println("Number is negative");
			else
				System.out.println("Number is zero");
			break;

		case 2:
			System.out.print("Enter the number - ");
			num = sc.nextInt();
			int i = 2;
			while (i < num) {
				if (num % i == 0) {
					System.out.println("Number is not Prime");
					break;
				}
				i++;
			}
			if(i == num)
			System.out.println("No is Prime");
			break;
		default:
			System.out.println("Wrong Choice..");
			break;
		}
	}

}
