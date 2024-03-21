package com.pavaneli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pavaneli.course.entities.OrderItem;
import com.pavaneli.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	

}
