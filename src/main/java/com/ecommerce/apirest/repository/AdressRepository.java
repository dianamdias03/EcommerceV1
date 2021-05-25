package com.ecommerce.apirest.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.apirest.models.Adress;
import com.ecommerce.apirest.models.Costumer;

public interface AdressRepository extends JpaRepository<Adress, Long>{

	Adress findByAdressId(Long adressId);	
	List<Adress> findByCostumer(Costumer costumer);
}
