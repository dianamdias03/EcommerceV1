package com.ecommerce.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.apirest.models.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	Category findByCategoryId(Long categoryId);
}
