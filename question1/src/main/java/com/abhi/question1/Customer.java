package com.abhi.question1;

public class Customer {
	private int id;  
	private String name;  
	private Address address;  
	private int contact; 
	
	
	
	public Customer(int id, String name, Address address, int contact) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}



	public Customer() {
		System.out.println("def cons");
		}  
	
	void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address.toString());
	    System.out.println(contact);
	}  
	
	
	
	//getter and setter
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//
//	public int getContact() {
//		return contact;
//	}
//
//	public void setContact(int contact) {
//		this.contact = contact;
//	}
//
//	void displayInfo(){  
//	    System.out.println(id+" "+name);  
//	    System.out.println(address);
//	    System.out.println(contact);
//	}  
//	  

}
