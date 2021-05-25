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

import com.ecommerce.apirest.models.Costumer;
import com.ecommerce.apirest.repository.CostumerRepository;

@RestController
@RequestMapping(value="/api")
public class CostumerResource {
	
	@Autowired
	CostumerRepository costumerRepository;
	
	@GetMapping("/costumer")
	public List<Costumer> listCostumer(){
		return costumerRepository.findAll();
	}
	
	@GetMapping("/costumer/{costumerId}")
	public Costumer listCostumerUnic(@PathVariable(value = "costumerId") long costumerId) {
		return costumerRepository.findByCostumerId(costumerId);
	}
	
	@PostMapping("/costumer")
	public Costumer saveCostumer (@RequestBody Costumer costumer) {
		return costumerRepository.save(costumer);
	}
	
	@DeleteMapping("/costumer")
	public void deleteCostumer(@RequestBody Costumer costumer) {
		costumerRepository.delete(costumer);
	}
	
	@PutMapping("/costumer")
	public Costumer updateCostumer(@RequestBody Costumer costumer) {
		return costumerRepository.save(costumer);
	}

	
}
