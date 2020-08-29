package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.OrderItem;

//@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
