package com.jspider.roxilartask.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
	@Id
	private int id;
	private String title;
	private double price;
	private String description;
	private String category;
	private String image;
	private boolean dateOfSale;
	public String getDateOfSale() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}