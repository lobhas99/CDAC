package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

/*
 * emps table 
emp_id(PK) ,first_name,last_name,
email(unique),password,join_date,emp_type(full_time/part_time/contract...),salary
 */
@Entity // mandatory
@Table(name = "emps")
public class Employee extends BaseEntity {
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
	// by def : hib creates int : column to store :ordinal values
	// to replace it by const names
	@Enumerated(EnumType.STRING) // col type varchar
	@Column(length = 20, name = "emp_type")
	private EmploymentType empType;
	private double salary;
	@Lob // for mysql : longblob : column type
	private byte[] image;
	// Employee *----->1 Department
	// Emp : many, child , owning side(FK)
	@ManyToOne // mandatory
	@JoinColumn(name = "dept_id", nullable = false)
	private Department myDept;
	// Employee : many, parent,inverse
//Emp *--->* Project
	@ManyToMany(mappedBy = "empSet")
	private Set<Project> projects = new HashSet<>();
	//Emp HAS-A AdhaarCard (eg of Emp --->AdhharCard , composite val type)
	@Embedded //optional
	private AdhaarCard card;
	//Emp HAS-A skills(skill name : string) (eg of collection of basic value types)
	@ElementCollection//mandatory
	@CollectionTable(name="employee_skills"
	,joinColumns =@JoinColumn(name="emp_id",nullable = false) )
	@Column(name="skill_name",length = 50)
	private List<String> skills=new ArrayList<>();
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
	

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}	
	

	public AdhaarCard getCard() {
		return card;
	}
	

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public void setCard(AdhaarCard card) {
		this.card = card;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + getId() + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", joinDate=" + joinDate + ", empType=" + empType + ", salary=" + salary + "]";
	}

}
