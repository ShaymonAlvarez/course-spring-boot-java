package com.example.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.Category;
import com.example.course.services.CategoryService;

//requisições de GET, REST são tratadas aqui
@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;//declarando dependencia 
	
	//requisição GET
	@GetMapping
	public ResponseEntity<List<Category>> findAll()
	{
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//requisição GET com parametro id na url
	@GetMapping(value ="/{id}")//path variable linka o parametro da url com o argumento da função abaixo 
	public ResponseEntity <Category> findById(@PathVariable Long id)
	{
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
