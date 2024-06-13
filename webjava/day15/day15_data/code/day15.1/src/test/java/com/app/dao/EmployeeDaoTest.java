package com.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.app.pojos.Employee;

@DataJpaTest 
@AutoConfigureTestDatabase(replace = Replace.NONE)
class EmployeeDaoTest //test class 
{
	//can autowire dao layer i/f
	@Autowired
	private EmployeeDao empDao;
	

	@Test //Junit annotation to indicate following is a test case
	void testFindByJoinDateBetween() {
		List<Employee> list = empDao.findByJoinDateBetween(LocalDate.parse("2020-01-10"),
				LocalDate.parse("2021-09-10"));
		//args : expected , actual
		assertEquals(1, list.size());
	}
	
	@Test
	void testFindByLastNameContaining() {
		List<Employee> list = empDao.findByLastNameContaining("b");
		assertEquals(4, list.size());
	}

}
