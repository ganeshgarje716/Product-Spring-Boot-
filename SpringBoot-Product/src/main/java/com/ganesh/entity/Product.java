package com.ganesh.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true)
	private String name;
	
	private String type;
	
	private Integer qty;
	
	private Double price;
	
	private Boolean active;

	
	
	
	
	public Product(Integer id, String name, String type, Integer qty, Double price, Boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.qty = qty;
		this.price = price;
		this.active = active;
	}
	
	
	
	
	

}
