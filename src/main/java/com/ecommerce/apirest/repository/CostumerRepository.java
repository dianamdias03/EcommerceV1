package com.ecommerce.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.apirest.models.Costumer;

public interface CostumerRepository extends JpaRepository<Costumer, Long>{
	Costumer findByCostumerId(Long costumerId);
}
