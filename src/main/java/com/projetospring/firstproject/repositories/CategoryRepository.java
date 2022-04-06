package com.projetospring.firstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.projetospring.firstproject.entities.Category;

// mecanismo de injeção de dependencia do spring boot
@Component
public class CategoryRepository {
	
	// Map é uma coleção de pares chaves valor.
	private Map<Long, Category> map = new HashMap<>();

	public void save(Category obj) {
		map.put(obj.getId(), obj);
		//inserindo caregoria guardando na memória
	}

	public Category findById(Long id) {
		return map.get(id);
	}
	
	public List<Category> findAll() {
		return new ArrayList<Category>(map.values());
		//pega todos os valores e instancia uma nova lista com esses valores
	}
}