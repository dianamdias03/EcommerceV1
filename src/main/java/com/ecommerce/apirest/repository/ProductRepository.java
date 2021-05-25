package com.ecommerce.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.apirest.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	Product findByProductId(long productId);	
}
