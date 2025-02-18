package com.day7;

public class Person2 {
	//data members
	private String name;//instance variable or field attribute
	private int age;//instance variable or field attribute
	private String city;
	
	//No Argument or 0-arg or default constructor
//	Who created deafault?->JVM 
	public Person2() {
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Person2(String name, int age) {
		//initialized the data
		this.name=name;
	    this.age=age;
	}
	
	
	
	//method
	void getData() {
		System.out.println("Hello,My name is " + this.name +" and I am having age "+this.age);
	}
	
	//java main method 
	public static void main(String[] args) {
		//created an objected of class Person
		
	   Person2 person=new Person2();
	   Person2 obj=new Person2("Swapnil",38);//constructor is invoked.
	   
	   Person2 obj1=new Person2("Rajshekar",31);
	   
	   obj.getData();
	   obj1.getData();
	}

}
