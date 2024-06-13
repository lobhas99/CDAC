package com.fashionsuperior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fashionsuperior.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
	

}
