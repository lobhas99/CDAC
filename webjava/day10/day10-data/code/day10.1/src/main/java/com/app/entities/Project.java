package com.app.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "projects")
public class Project extends BaseEntity {
	@Column(length = 100,unique = true)
	private String title;
	@Column(name="start_date")
	private LocalDate startDate;
	@Column(name="end_date")
	private LocalDate endDate;
	//many , parent , owning
	//Project *--->* Emp
	@ManyToMany //mandatory
	//optional BUT reco.
	@JoinTable(name="project_emps",
	joinColumns = @JoinColumn(name="project_id"),
	inverseJoinColumns = @JoinColumn(name="emp_id")
	)
	
	private Set<Employee> empSet=new HashSet<>();

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String title, LocalDate startDate, LocalDate endDate) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	

	public Set<Employee> getEmpSet() {
		return empSet;
	}

	public void setEmpSet(Set<Employee> empSet) {
		this.empSet = empSet;
	}

	@Override
	public String toString() {
		return "Project " + getId() + " [title=" + title + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	//mandatory to override hashCode n equals as per the contract

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Project other = (Project) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	//add helper methods to establish bi dir asso between Emp n Project
	public void addEmployee(Employee emp)
	{
		empSet.add(emp);//project ---> emp
		emp.getProjects().add(this);//emp --> project
	}
	public void removeEmployee(Employee emp)
	{
		empSet.remove(emp);
		emp.getProjects().remove(this);
	}
	

}
