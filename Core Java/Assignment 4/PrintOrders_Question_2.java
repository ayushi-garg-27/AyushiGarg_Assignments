package assignment4.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.function.Predicate;

class Order{
	String name;
	double price;
	String status;
	
	
	
	
	public Order(String name, double price, String status) {
		super();
		this.name = name;
		this.price = price;
		this.status = status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [name=" + name + ", price=" + price + ", status=" + status + "]";
	}
	
	
	
}


public class PrintOrders_Question_2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Order> order = Arrays.asList(
				new Order("IceCream",200,"Accepted"),
				new Order("Rice",300,"Completed"),
				new Order("ColdDrink",20000,"Accepted"),
				new Order("GolGappe",200,"Cancelled"),
				new Order("Cake",200,"Preparing"),
				new Order("Burger",200,"Completed"),
				new Order("Fries",200,"Accepted"),
				new Order(" MilkShake",12000,"Completed")
				);
		
		System.out.println("Order price more than 10000 : ");
		print(order,o->o.getPrice()>10000);
		
		System.out.println("Order status ACCEPTED or COMPLETED : \n");
		
		print(order, o -> o.getStatus().equalsIgnoreCase("accepted")||o.getStatus().equalsIgnoreCase("completed"));

	}
	
	public static void print(List<Order> order, Predicate<Order> predicate) {
		for(Order o : order) {
			if(predicate.test(o)) {
				System.out.println(o);
				
				
			}
		}
		
	}

}
