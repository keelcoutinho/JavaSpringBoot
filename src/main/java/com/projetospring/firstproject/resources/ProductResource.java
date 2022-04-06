package com.projetospring.firstproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetospring.firstproject.entities.Product;
import com.projetospring.firstproject.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductResource { 
	
	// Instancia do categoryRepository dentro do ProductResource:
	/*Ele faz um pré-processamento da dependência. Mas para ele funcionar é necessário colocar @Component
	na classe que deseja instanciar.*/
	@Autowired
	private ProductRepository categoryRepository;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = categoryRepository.findAll();
		// injeção de um mecanismo de depêndência do spring boot
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
}
