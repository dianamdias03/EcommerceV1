package com.ecommerce.apirest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.apirest.models.Product;
import com.ecommerce.apirest.repository.ProductRepository;

import java.util.List;

//controller
@RestController
@RequestMapping(value="/api")
public class ProductResource {
	@Autowired
	ProductRepository productRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/product")
	public List<Product> listProduct(){
		return productRepository.findAll();
	}
	
	@GetMapping("/product/{productId}")
	public Product listProductUnic(@PathVariable(value = "productId") long productId){
		return productRepository.findByProductId(productId);
	}
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@DeleteMapping("/product")
	public void deleteProduct(@RequestBody Product product) {
		productRepository.delete(product);
	}
	
	@PutMapping("/product")
	public Product updateProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}

}
