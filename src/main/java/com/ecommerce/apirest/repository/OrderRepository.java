package com.ecommerce.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.apirest.models.Costumer;
import com.ecommerce.apirest.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	Order findByOrderId(Long orderId);
	List<Order> findByCostumer(Costumer costumer);
}
