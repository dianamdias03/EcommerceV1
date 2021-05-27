package com.ecommerce.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.apirest.models.Category;
import com.ecommerce.apirest.models.CategoryProduct;
import com.ecommerce.apirest.models.Product;

public interface CategoryProductRepository extends JpaRepository<CategoryProduct, Long>{
	CategoryProduct findByCategoryProductId(Long categoryProductId);
	List<CategoryProduct> findByCategory(Category category);
	List<CategoryProduct> findByProduct(Product product);
	List<CategoryProduct> findByCategoryAndProduct(Category category, Product product);
	
}
