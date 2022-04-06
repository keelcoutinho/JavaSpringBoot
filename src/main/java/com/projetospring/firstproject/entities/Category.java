package com.projetospring.firstproject.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*
Serializable
Ela dá capacidade da classe produzir um formato em que os dados do objeto sejam usados de forma externa ao
código, em geral ele é persistido em alguma forma de armazenamento temporário ou permanente ou é 
transmitido para outro recurso.

Este formato pode ser texto ou binário em diversas variantes padrões ou proprietárias. É muito comum usar 
JSON ou XML.*/

public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	
	//Anotation que vai efetuar um pré-processamento para dizer que não é para serializar essa categoria
	@JsonIgnore
	private List<Product> products = new ArrayList<>();
	// Implementando uma lista Product
	
	public Category() {
		
	} 
	
	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// importar o get da List, não precisa colocar o set pois em momento algum vou trocar a minha lista
	public List<Product> getProducts() {
		return products;
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	/*O código hash pode servir para identificar que algo é diferente mais rapidamente do que olhar 
	 * um objeto enorme. Ele junto de um trecho do objeto pode quase garantir a unicidade. Ele sozinho 
	 * não é tão útil para isto. Não que isto costume ser usado na prática.
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id);
	}
	
	/*O método equals é utilizado para comparações. A classe String e as classes Wrapper sobrescrevem 
	 * equals() para garantir que dois objetos desses tipos, com o mesmo conteúdo, possam ser 
	 * considerados iguais.
	 */

	
	
	

}
