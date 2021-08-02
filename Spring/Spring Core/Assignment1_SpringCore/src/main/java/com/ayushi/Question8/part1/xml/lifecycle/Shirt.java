package com.ayushi.Question8.part1.xml.lifecycle;

public class Shirt {
	private String colour;
	private float price;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		System.out.println("Setting colour of the shirt");
		this.colour = colour;
	}
	public float getPrice() {
		System.out.println("Price of Shirt");
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Shirt() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Shirt [colour=" + colour + ", price=" + price + "]";
	} 
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy method");
	}
	

}
