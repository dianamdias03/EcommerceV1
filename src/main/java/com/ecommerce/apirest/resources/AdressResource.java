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

import com.ecommerce.apirest.models.Adress;
import com.ecommerce.apirest.models.Costumer;
import com.ecommerce.apirest.repository.AdressRepository;

import java.util.List;

//controller
@RestController
@RequestMapping(value="/api")
public class AdressResource {
	@Autowired
	AdressRepository adressRepository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/adress")
	public List<Adress> listAdress(){
		return adressRepository.findAll();
	}
	
	@GetMapping("/adress/{adressId}")
	public Adress listAdressUnic(@PathVariable(value = "adressId") long adressId){
		return adressRepository.findByAdressId(adressId);
	}
	
	@GetMapping("/adress/costumer/{costumerId}")
	public List<Adress> listAdressCostumer(@PathVariable(value = "costumerId") Costumer costumer){
		return adressRepository.findByCostumer(costumer);
	}
	
	@PostMapping("/adress")
	public Adress saveAdress(@RequestBody Adress adress) {
		return adressRepository.save(adress);
	}
	
	@DeleteMapping("/adress")
	public void deleteAdress(@RequestBody Adress adress) {
		adressRepository.delete(adress);
	}
	
	@PutMapping("/adress")
	public Adress updateAdress(@RequestBody Adress adress) {
		return adressRepository.save(adress);
	}

	
}
