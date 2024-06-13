package com.app.pojos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "emps")
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = { "image", "projects", "dept", "password", "card" }, callSuper = true)
@EqualsAndHashCode(of = "email",callSuper = false)
public class Employee extends BaseEntity {
	@Column(name = "first_name", length = 20)
	private String firstName = "abc";
	@Column(name = "last_name", length = 20)
	private String lastName;
	@Column(length = 20, unique = true)
	private String email;
	@Column(length = 25, nullable = false)
	private String password;
	@Column(name = "join_date")
	// def date format, SC uses : MM/dd/yyyy
	// To customize it :
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate joinDate;
	@Enumerated(EnumType.STRING) // varchar
	@Column(name = "emp_type", length = 20)
	private EmploymentType empType;
	private double salary;
	@Lob
	private byte[] image;
	// Employee *--->1 Department
	@ManyToOne//(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id", nullable = false)
	private Department dept;
	// Emp *--->* Project
	// parent , many , inverse side
	@ManyToMany(mappedBy = "employees")
	private Set<Project> projects = new HashSet<>();
	// Emp HAS-A AdhaarCard(Emp 1--->1 AdhaarCard) : strong asso (composition)
	@Embedded // optional annotation
	private AdhaarCard card;

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

	// overloaded ctor to init specific state
	public Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

}
