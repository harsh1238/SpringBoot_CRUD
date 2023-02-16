package com.yash.ems.model;

public class JavaTraining {
	
	int id;
	String name;
	double price; 
	
	public JavaTraining(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public JavaTraining() {
		// TODO Auto-generated constructor stub
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
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


	@Override
	public String toString() {
		return "JavaTraining [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
