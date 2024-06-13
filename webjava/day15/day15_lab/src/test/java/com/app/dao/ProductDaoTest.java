package com.app.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.entities.Category;
import com.app.entities.Product;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class ProductDaoTest {
	// depcy
	@Autowired
	private ProductDao dao;

	@Test
	void testSaveEmps() {
		List<Product> list = List.of(
				new Product("Walking Shoes", "Comfortable foot wear", Category.FOOTWEAR, 1500, 100,
						LocalDate.parse("2026-01-01")),
				new Product("Fountain Head", "Fiction", Category.BOOKS, 500, 10, LocalDate.parse("2027-01-01"))
		);
		List<Product> list2 = dao.saveAll(list);
		assertEquals(2,list2.size());

	}

}
