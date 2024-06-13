package com.app.entities;

import java.time.LocalDate;
import java.util.Enumeration;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
public class User extends BaseEntity {

	@Column(name = "user_name")
	private String userName;

	@Column
	private String email;

	@Column(name = "phone_no")
	private String phoneNo;

	@Column
	private String password;

	@Enumerated(EnumType.STRING)
	private RoleType Role;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate regDate;

}
