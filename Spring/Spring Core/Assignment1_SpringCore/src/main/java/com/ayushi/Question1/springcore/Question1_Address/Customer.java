package com.ayushi.Question1.springcore.Question1_Address;

public class Customer {
	private int id;
	private String name;
	private int contact;
	private Address address;
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
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println(id+""+name+""+contact);
		System.out.println(address);
	}

	
	

}
