package com.ayushi.Question1.part2.CI;

import com.ayushi.Question1.part2.CI.Address;

public class Customer {
	 int id;
	 String name;
	 int contact;
	 Address address;
	 
	 public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	public Customer(int id, String name, int contact, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
	}

	/*@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", "
				+ "contact=" + contact + ", address=" + 
				address + "{"+this.address.getCity()+ 
				","+this.address.getStreet()+","+
				this.address.getState()+","+
				this.address.getZip()+","+this.address.getCountry()+"]";
	}*/
	
	void show() {
		System.out.println(id+" "+name+" "+contact);
		System.out.println(address.toString());
	}

}
