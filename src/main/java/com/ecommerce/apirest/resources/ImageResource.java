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

import com.ecommerce.apirest.models.Image;
import com.ecommerce.apirest.models.Product;
import com.ecommerce.apirest.repository.ImageRepository;

import java.util.List;

//controller
@RestController
@RequestMapping(value="/api")
public class ImageResource {
	@Autowired
	ImageRepository imageRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/image")
	public List<Image> listImage(){
		return imageRepository.findAll();
	}
	
	@GetMapping("/image/{imageId}")
	public Image listImageUnic(@PathVariable(value = "imageId") long imageId){
		return imageRepository.findByImageId(imageId);
	}
	
	@GetMapping("/image/product/{productId}")
	public List<Image> listImageProduct(@PathVariable(value = "productId") Product product){
		return imageRepository.findByProduct(product);
	}
	
	@PostMapping("/image")
	public Image saveImage(@RequestBody Image image) {
		return imageRepository.save(image);
	}
	
	@DeleteMapping("/image")
	public void deleteImage(@RequestBody Image image) {
		imageRepository.delete(image);
	}
	
	@PutMapping("/image")
	public Image updateImage(@RequestBody Image image) {
		return imageRepository.save(image);
	}

	
}
