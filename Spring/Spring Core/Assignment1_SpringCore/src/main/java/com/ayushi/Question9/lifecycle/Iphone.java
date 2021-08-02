package com.ayushi.Question9.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Iphone implements InitializingBean, DisposableBean {
	private String colour;
	private float price;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		System.out.println("Resetting the Iphone");
		this.colour = colour;
	}
	public float getPrice() {
		System.out.println("Price of Iphone");
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Iphone() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Iphone [colour=" + colour + ", price=" + price + "]";
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init
		System.out.println("Bought new Iphone - init");
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Gave the Iphone to my brother  - destroy");
		
	} 
	
	/*public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy method");
	}*/

}
