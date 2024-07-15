package com.jspider.roxilartask.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
public class Product {
	@Id
	private int id;
	private String title;
	private double price;
	private String description;
	private String category;
	private String image;
	private boolean dateOfSale;
	
}