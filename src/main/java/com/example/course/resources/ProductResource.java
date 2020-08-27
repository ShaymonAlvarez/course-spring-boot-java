package com.example.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.Product;
import com.example.course.services.ProductService;

//requisições de GET, REST são tratadas aqui
@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;//declarando dependencia 
	
	//requisição GET
	@GetMapping
	public ResponseEntity<List<Product>> findAll()
	{
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//requisição GET com parametro id na url
	@GetMapping(value ="/{id}")//path variable linka o parametro da url com o argumento da função abaixo 
	public ResponseEntity <Product> findById(@PathVariable Long id)
	{
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
