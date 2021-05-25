package com.ecommerce.apirest.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.apirest.models.Image;
import com.ecommerce.apirest.models.Product;

public interface ImageRepository extends JpaRepository<Image, Long>{

	Image findByImageId(Long imageId);	
	List<Image> findByProduct(Product product);
}
