package com.devsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.Entities.Order;

public interface  OrderRepository extends JpaRepository<Order, Long> {
	
	
}


 