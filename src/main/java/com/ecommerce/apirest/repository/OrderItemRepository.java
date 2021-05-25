package com.ecommerce.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.apirest.models.Costumer;
import com.ecommerce.apirest.models.Order;
import com.ecommerce.apirest.models.OrderItem;
import com.ecommerce.apirest.models.Product;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	Order findByOrderItemId(Long orderItemId);
	List<OrderItem> findByOrder(Order order);
	List<OrderItem> findByProduct(Product product);
	List<OrderItem> findByProductAndOrder(Product product, Order order);
}
