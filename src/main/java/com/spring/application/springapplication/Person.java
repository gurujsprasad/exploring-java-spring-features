package com.spring.application.springapplication;

import java.util.List;

public class Person {
	//constructor arguments - DI
	private int id;
	private String name;
	
	//setting bean property - DI
	private int taxId;  
	
	//dependency injection - bean
	private Address address; 
	
	//List as an argument to constructor
	private List<String> contacts;
	
	//list of beans
	private List<JobExperience> jobs; 
	
	
	public void setJobs(List<JobExperience> jobs) {
		this.jobs = jobs;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + ", contacts="
				+ contacts + ", jobs=" + jobs + "]";
	}

	public static Person getPerson(int id, String name, List<String> contacts){
		System.out.println("creating person from factory method");
		return new Person(id,name,contacts);
	}
	
	public void initMethod (){
		System.out.println("person bean created:"+this );
	}
	public void destroyMethod(){
		System.out.println("person destroyed");
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	Person(int id, String name, List<String> contacts){
		this.id = id;
		this.name = name;
		this.contacts = contacts;
	}
	
	public void display(){
		System.out.println("Hello person !!");
	}
	public void displayPerson(){
		System.out.println(this.name);
	}

	

	

	
	
}
