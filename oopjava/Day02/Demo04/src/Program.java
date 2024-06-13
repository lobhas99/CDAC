
class Date{
	int day;
	int month;
	int year;
	
	public void displayDate() {
		System.out.println("day - "+day);
		System.out.println("month - "+month);
		System.out.println("year - "+year);
		
	}
}

class Employee{
	int id;
	String name;
	double salary;
	Date doj;//reference
	
	public void displayEmployee() {
		System.out.println("Id - "+id);
		System.out.println("Name - "+name);
		System.out.println("Salary - "+salary);
		//doj.displayDate();// NULLPointerException
		doj = new Date();
		doj.displayDate();
	}
}

public class Program {

	public static void main(String[] args) {
		Employee e1 = null; // reference
		//e1.displayEmployee(); // NULLPointerException 
		e1 = new Employee(); // Object
		e1.displayEmployee(); 
	}

}
