
class Employee {
	int id;
	String name;
	double salary;

	public void initEmployee() {
		id = 1;
		name = "rohan";
		salary = 10000;
	}

	public void displayEmployee() {
		System.out.println("Id - " + id);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);
	}
	
	public void incrementSalary() {
		salary = salary*2;
	}
}

public class Program {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.initEmployee();
		e1.displayEmployee();

		Employee e2 = e1;
		e2.displayEmployee();
		
		e2.incrementSalary();
		
		System.out.println("After Change in salary = ");
		e1.displayEmployee();
		e2.displayEmployee();
	}

}
