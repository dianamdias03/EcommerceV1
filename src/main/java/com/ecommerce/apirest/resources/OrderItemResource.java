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
import com.ecommerce.apirest.models.OrderItem;
import com.ecommerce.apirest.models.Product;
import com.ecommerce.apirest.repository.OrderItemRepository;

@RestController
@RequestMapping(value="/api")
public class OrderItemResource {
	@Autowired
	OrderItemRepository orderItemRepository;
	
	@GetMapping("/orderItem")
	public List<OrderItem> listOrderItem(){
		return orderItemRepository.findAll();
	}
	
	@GetMapping("/orderItem/order/{orderId}")
	public List<OrderItem> listOrderItemOrdem(@PathVariable(value = "orderId") Order order){
		return orderItemRepository.findByOrder(order);
	}
	
	@GetMapping("/orderItem/product/{productId}")
	public List<OrderItem> listOrderItemProduct(@PathVariable(value = "productId") Product product){
		return orderItemRepository.findByProduct(product);
	}
	
	@GetMapping("/orderItem/order/{orderId}/product/{productId}")
	public List<OrderItem> listOrderItemOrderProduct(@PathVariable(value = "productId") Product product, @PathVariable(value = "orderId") Order order){
		return orderItemRepository.findByProductAndOrder(product, order);
	}
	
	@PostMapping("/orderItem")
	public OrderItem saveOrder(@RequestBody OrderItem orderItem) {
		return orderItemRepository.save(orderItem);
	}
	
	@DeleteMapping("/orderItem")
	public void deleteOrder(@RequestBody OrderItem orderItem) {
		orderItemRepository.delete(orderItem);
	}
	
	@PutMapping("/orderItem")
	public OrderItem updateOrder(@RequestBody OrderItem orderItem) {
		return orderItemRepository.save(orderItem);
	}
	
}





