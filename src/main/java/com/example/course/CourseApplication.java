package com.example.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}

}

//spring.jpa.open-in-view=true
//permite o serializador json jackson puxar pedidos associados as classes
//permite que um componete do fim do ciclo de vida chame o banco de dados