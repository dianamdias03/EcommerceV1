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
import com.ecommerce.apirest.models.Costumer;
import com.ecommerce.apirest.repository.CategoryRepository;

@RestController
@RequestMapping(value="/api")
public class CategoryResource {
	@Autowired
	CategoryRepository categoryRepository;
	
	@GetMapping("/category")
	public List<Category> listCategory(){
		return categoryRepository.findAll();
	}
	
	@GetMapping("/category/{categoryId}")
	public Category listCategoryUnic(@PathVariable(value = "categoryId") long categoryId){
		return categoryRepository.findByCategoryId(categoryId);
	}
	
	
	@PostMapping("/category")
	public Category saveCategory(@RequestBody Category category) {
		return categoryRepository.save(category);
	}
	
	@DeleteMapping("/category")
	public void deleteCategory(@RequestBody Category category) {
		categoryRepository.delete(category);
	}
	
	@PutMapping("/category")
	public Category updateCategory(@RequestBody Category category) {
		return categoryRepository.save(category);
	}

}
