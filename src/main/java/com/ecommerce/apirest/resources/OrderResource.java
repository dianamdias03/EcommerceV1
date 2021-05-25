package com.ecommerce.apirest.resources;

import java.util.List;

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

import com.ecommerce.apirest.models.Costumer;
import com.ecommerce.apirest.models.Order;
import com.ecommerce.apirest.repository.OrderRepository;

@RestController
@RequestMapping(value="/api")
public class OrderResource {
	@Autowired
	OrderRepository orderRepository;
	
	@GetMapping("/order")
	public List<Order> listOrder(){
		return orderRepository.findAll();
	}
	
	@GetMapping("/order/{orderId}")
	public Order listOrderUnic(@PathVariable(value = "orderId") long orderId) {
		return orderRepository.findByOrderId(orderId);
	}
	
	@GetMapping("/order/costumer/{costumerId}")
	public List<Order> listOrderCostumer(@PathVariable(value = "costumerId") Costumer costumer){
		return orderRepository.findByCostumer(costumer);
	}
	
	@PostMapping("/order")
	public Order saveOrder(@RequestBody Order order) {
		return orderRepository.save(order);
	}
	
	@DeleteMapping("/order")
	public void deleteOrder(@RequestBody Order order) {
		orderRepository.delete(order);
	}
	
	@PutMapping("/order")
	public Order updateOrder(@RequestBody Order order) {
		return orderRepository.save(order);
	}
	
}





