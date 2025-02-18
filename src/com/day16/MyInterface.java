package com.day16;

public interface MyInterface {
	default void m1() {
		System.out.println("This is method-1 impl.");
		commonbusinessmethod();
	}
	
	default void m2() {
		System.out.println("This is method-2 impl.");
		commonbusinessmethod();
	}
	
	private void commonbusinessmethod() {
		System.out.println("This is common business methods for the security.");
	}

}
