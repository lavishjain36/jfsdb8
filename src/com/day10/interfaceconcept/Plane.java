package com.day10.interfaceconcept;

interface  Plane {
//	what interface by default?->public static and final.
	
	int price=0;//constant interface
	//abstract method-100% abstract
	void takeoff();
	void fly();
	void landing();
	
	
	//default method
	default void airport() {
		System.out.println("All planes need airport");
	}
	
	//static method can be implemented.
	static void canteen() {
		System.out.println("All Airport must have canteen.");
	}

}
