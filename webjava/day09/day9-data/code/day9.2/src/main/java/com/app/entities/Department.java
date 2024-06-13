package com.app.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department extends BaseEntity {
	@Column(name="dept_name",length = 20,unique = true)
	private String deptName;
	@Column(length = 30)
	private String location;
	// Department 1---->* Emp
	//Dept : one , parent , non owning(inverse)
	@OneToMany (mappedBy = "myDept",
			cascade = CascadeType.ALL
			,orphanRemoval = true,
			fetch=FetchType.EAGER
			)//mandatory anno , o.w throws MappingException
	//mappedBy => current side is the inverse side of the asso
	//cascade => to propagates ALL (save,update,delete) changes from parent entity --> child entity
	private List<Employee> employees = new ArrayList<>();

	/*
	 * As per Founder's suggestion : init the collection always! to avoid
	 * NullPointerException
	 */
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String deptName, String location) {
		super();
		this.deptName = deptName;
		this.location = location;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	//add helper methods to establish : a bi dir asso between entities
	public void addEmployee(Employee emp)
	{
		employees.add(emp);//parent ---> child
		emp.setMyDept(this);//child ---> parent 
		
	}
	//add helper methods to un - establish : a bi dir asso between entities
		public void removeEmployee(Employee emp)
		{
			employees.remove(emp);//parent ----X--> child
			emp.setMyDept(null);//child ---X---> parent 
			
		}

	// avoid adding association fields in toString
	@Override
	public String toString() {
		return "Department " + getId() + " [deptName=" + deptName + ", location=" + location + "]";
	}

}
