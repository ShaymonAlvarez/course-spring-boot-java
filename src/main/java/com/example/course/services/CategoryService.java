package com.example.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.entities.Category;
import com.example.course.repositories.CategoryRepository;

//registrando a classe como componente do Spring (pode ser usado por exemplo o Repository,
//,Component ou o Service)
@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;//injeção de dependencia
	
	public List<Category> findAll()
	{
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
