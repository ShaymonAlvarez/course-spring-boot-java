package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Order;
import com.example.course.repositories.OrderRepository;

//registrando a classe como componente do Spring (pode ser usado por exemplo o Repository,
//,Component ou o Service)
@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;//injeção de dependencia
	
	public List<Order> findAll()
	{
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
