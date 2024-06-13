package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.app.entities.EmploymentType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeDTO {
	@JsonProperty(access = Access.READ_ONLY) // used during serialization
	private Long id;	
	private String firstName;
	private String lastName;	
	private String email;
	@JsonProperty(access =Access.WRITE_ONLY )
	private String password;	
	private LocalDate joinDate;
	private EmploymentType empType;
	private double salary;
	@JsonProperty(access = Access.WRITE_ONLY)//used during de-ser
	private Long deptId;
}
