package com.projetospring.firstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetospring.firstproject.entities.Category;

// mecanismo de injeção de dependencia do spring boot
@Repository // Alteração da anotation @Component por @Repository | alteração de classe para interface
public interface CategoryRepository extends JpaRepository<Category, Long> {
	// O JpaRepository é generics, precisa dizer o tipo da entidade(T) e o tipo do Id
	
		
	/* Exemplo manual, antes de trocar o código dos repositories e implementar o JpaRepository<Entity, ID>
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
	} */
	
	
}