package com.projetospring.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projetospring.firstproject.entities.Category;
import com.projetospring.firstproject.repositories.CategoryRepository;

@SpringBootApplication
public class FirstprojectApplication implements CommandLineRunner{
	
	// Instancia do categoryRepository:
	/*Ele faz um pré-processamento da dependência. Mas para ele funcionar é necessário colocar @Component
	na classe que deseja instanciar.*/
	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L, "Electronics");
		Category cat2 = new Category(2L, "Books");
		
		//Usar o CategoryRepository para inportar os objetos para dentro do map
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
	}

}
