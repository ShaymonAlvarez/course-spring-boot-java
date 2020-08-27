package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Product;
import com.example.course.repositories.ProductRepository;

//registrando a classe como componente do Spring (pode ser usado por exemplo o Repository,
//,Component ou o Service)
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;//injeção de dependencia
	
	public List<Product> findAll()
	{
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
