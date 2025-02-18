package com.day7;

public class Person {
	//data members
	String name;//instance variable or field attribute
	int age;//instance variable or field attribute
	
	//No Argument or 0-arg or default constructor
	Person(){
		//This is default constructor
		System.out.println("This is default constructor.");
	}
	
	//method
	void getData() {
		System.out.println("Hello,My name is " + name +" and I am having age "+age);
	}
	
	//java main method 
	public static void main(String[] args) {
		//created an objected of class Person
	   Person obj=new Person();//constructor is invoked.
	   obj.name="Swapnil";
	   obj.age=38;
	   
	   obj.getData();//calling or invoking of method
	}

}
