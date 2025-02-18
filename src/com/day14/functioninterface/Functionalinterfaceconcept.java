package com.day14.functioninterface;

import java.util.function.Predicate;

public class Functionalinterfaceconcept {

	//functional programming
	public static void main(String[] args) {
		//To check if the number is even or odd.
		Predicate<Integer> iseven=num->num%2==0;
		//test it 
		System.out.println(iseven.test(8));
		System.out.println(iseven.test(5));

	}

}
