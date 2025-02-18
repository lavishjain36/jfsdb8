package com.day10.abstractions;

//Abstract class is class that contains abstract method and non-abstract method.

abstract  class Plane {
	
	Plane(){
		//constructor of Plane class
		System.out.println("Plane Class constructor");
	}
	//abstract method ->abstract method only contains method signature or method defintion
	//but implementation is not possible for abstract 
	abstract public void takeoff();
	abstract public void fly();
	abstract public void landing();
	
	//Non-Abstract method or instance method or concrete method
	//Prevent further modification from child classes.
	public  void airport() {
		System.out.println("All planes need airport.");
	}
	
}
