package com.ecommerce.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.apirest.models.Category;
import com.ecommerce.apirest.models.CategoryProduct;
import com.ecommerce.apirest.models.Product;
import com.ecommerce.apirest.repository.CategoryProductRepository;

@RestController
@RequestMapping(value="/api")
public class CategoryProductResource {
	@Autowired
	CategoryProductRepository categoryProductRepository;
	
	@GetMapping("/categoryProduct")
	public List<CategoryProduct> listCategoryProduct(){
		return categoryProductRepository.findAll();
	}
	
	@GetMapping("/categoryProduct/{categoryProductId}")
	public CategoryProduct listCategoryProductUnic(@PathVariable(value = "categoryProductId") long categoryProductId){
		return categoryProductRepository.findByCategoryProductId(categoryProductId);
	}
	
	@GetMapping("/categoryProduct/category/{categoryId}")
	public List<CategoryProduct> listCategoryProductCategory(@PathVariable(value = "categoryId") Category category){
		return categoryProductRepository.findByCategory(category);
	}
	
	
	@GetMapping("/categoryProduct/product/{productId}")
	public List<CategoryProduct> listCategoryProductProduct(@PathVariable(value = "productId") Product product){
		return categoryProductRepository.findByProduct(product);
	}
	
	@PostMapping("/categoryProduct")
	public CategoryProduct saveCategoryProduct(@RequestBody CategoryProduct categoryProduct) {
		return categoryProductRepository.save(categoryProduct);
	}
	
	@DeleteMapping("/categoryProduct")
	public void deleteCategoryProduct(@RequestBody CategoryProduct categoryProduct) {
		categoryProductRepository.delete(categoryProduct);
	}
	
	@PutMapping("/categoryProduct")
	public CategoryProduct updateCategoryProduct(@RequestBody CategoryProduct categoryProduct) {
		return categoryProductRepository.save(categoryProduct);
	}
}
