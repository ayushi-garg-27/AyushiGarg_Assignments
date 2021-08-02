package com.ayushi.Question8.part1.annotations.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Laptop {
	private String colour;
	private float price;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		System.out.println("Selecting the Colour of Laptop");
		this.colour = colour;
	}
	public float getPrice() {
		System.out.println("Price of Laptop");
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shirt [colour=" + colour + ", price=" + price + "]";
	} 
	
	@PostConstruct
	public void start() {
		System.out.println("Inside init method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Inside Destroy method");
	}
	

}


