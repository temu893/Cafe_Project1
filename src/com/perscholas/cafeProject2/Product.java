package com.perscholas.cafeProject2;

import java.util.Scanner;

public abstract class Product {
	//(name, price, description, quantity)
	
	private String name;
	private double price;
	private String description ;
	private int quantity ;
	
	
	public Product(String name, double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}
	
	public Product() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}
 	Scanner s = new Scanner(System.in);
	public void setQuantity(int quantity) {
		this.quantity = quantity;

	}
	
	//include a method named calculateProductTotal( ) which calculates the product subtotal for the order.

//	public double calculateProductTotal(){
//	double subtotal = quantity * price ;
//	return subtotal ;
//	}

	public abstract double calculateProductTotal();

}
