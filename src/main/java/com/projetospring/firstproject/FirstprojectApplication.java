package com.projetospring.firstproject;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projetospring.firstproject.entities.Category;
import com.projetospring.firstproject.entities.Product;
import com.projetospring.firstproject.repositories.CategoryRepository;
import com.projetospring.firstproject.repositories.ProductRepository;

@SpringBootApplication
public class FirstprojectApplication implements CommandLineRunner{
	
	// Instancia do categoryRepository:
	/*Ele faz um pré-processamento da dependência. Mas para ele funcionar é necessário colocar @Component
	na classe que deseja instanciar.*/
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");

		Product p1 = new Product(1L, "TV", 2500.00, cat1);
		Product p2 = new Product(2L, "Domain Driven Design", 120.00, cat2);
		Product p3 = new Product(3L, "PS5", 4800.00, cat1);
		Product p4 = new Product(4L, "Docker", 100.00, cat2);
		
		// relacinar os produtos as categorias usando o metodo addAll e Array.asList
		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));
		
		//Usar o CategoryRepository para inportar os objetos para dentro do map
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		
	}

}
