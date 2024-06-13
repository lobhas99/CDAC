package com.app.entities;

import java.time.LocalDate;
import javax.persistence.*;

/*
 * emps table 
emp_id(PK) ,first_name,last_name,
email(unique),password,join_date,emp_type(full_time/part_time/contract...),salary
 */
@Entity // mandatory
@Table(name = "emps")
public class Employee extends BaseEntity{
	@Column(name = "first_name", length = 30) // varchar(30)
	private String firstName;
	@Column(name = "last_name", length = 30)
	private String lastName;
	@Column(unique = true, length = 30) // unique constraint
	private String email;
	@Column(length = 20, nullable = false) // not null
	private String password;
	@Column(name = "join_date")
	private LocalDate joinDate;
	//by def : hib creates int : column to store :ordinal values
	//to replace it by const names 
	@Enumerated(EnumType.STRING)//col type varchar
	@Column(length = 20,name="emp_type")
	private EmploymentType empType;
	private double salary;
	@Lob//for mysql : longblob : column type
	private byte[] image;
	//Employee *----->1 Department
	//Emp : many, child , owning side(FK)
	@ManyToOne //mandatory
	@JoinColumn(name = "dept_id" ,nullable = false )	
	private Department myDept;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee(String firstName, String lastName, String email, String password, LocalDate joinDate,
			EmploymentType empType, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.joinDate = joinDate;
		this.empType = empType;
		this.salary = salary;
	}


	public Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public EmploymentType getEmpType() {
		return empType;
	}

	public void setEmpType(EmploymentType empType) {
		this.empType = empType;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}

	public Department getMyDept() {
		return myDept;
	}

	public void setMyDept(Department myDept) {
		this.myDept = myDept;
	}


	@Override
	public String toString() {
		return "Employee [empId=" +getId() + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", joinDate=" + joinDate + ", empType=" + empType + ", salary=" + salary + "]";
	}

}
