package com.projetospring.firstproject.repositories;


	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	import org.springframework.stereotype.Component;

	import com.projetospring.firstproject.entities.Product;

	// mecanismo de injeção de dependencia do spring boot
	@Component
	public class ProductRepository {
		
		// Map é uma coleção de pares chaves valor.
		private Map<Long, Product> map = new HashMap<>();

		public void save(Product obj) {
			map.put(obj.getId(), obj);
			//inserindo caregoria guardando na memória
		}

		public Product findById(Long id) {
			return map.get(id);
		}
		
		public List<Product> findAll() {
			return new ArrayList<Product>(map.values());
			//pega todos os valores e instancia uma nova lista com esses valores
		}

}
