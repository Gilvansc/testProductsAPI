package com.example.webSimple.entities;

public class Product {
	private long id;
	private String name;
	private double price;
	Department department;

	public Product(long id, String name, double price, Department department) {
		setId(id);
		setName(name);
		setPrice(price);
		setDepartment(department);
		ProductService.addProduct(this);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
}
