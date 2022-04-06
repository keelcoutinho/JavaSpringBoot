package com.projetospring.firstproject.entities;

import java.io.Serializable;
import java.util.Objects;

/*Serializable
Ela dá capacidade da classe produzir um formato em que os dados do objeto sejam usados de forma externa ao
código, em geral ele é persistido em alguma forma de armazenamento temporário ou permanente ou é 
transmitido para outro recurso.

Este formato pode ser texto ou binário em diversas variantes padrões ou proprietárias. É muito comum usar 
JSON ou XML.*/
public class Product implements Serializable{
	
	//inserir a opção default	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double price;
	
	private Category category;
	
	// Um contrutor vazio
	public Product() {	
		
	}
	
	// construtor
	public Product(Long id, String name, Double price, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
