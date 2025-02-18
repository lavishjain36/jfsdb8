package com.day16;

import java.util.List;

public class Varkeywordconcept {
	
//	var num=10;//instance variable
//	var data=null;

	//introduced-java-10 version.
//	allows you to declare local varaible type inteference,
	public static void main(String[] args) {
		var empname="Swapnil";//String
		System.out.println(empname);
		
//		var empname=10;
		var num=10;
		System.out.println(num);
		
		var salary=10000.00;
		System.out.println(salary);

		
		//Collection 
		var names=List.of("Lavish","Rajashekar","Suriya Kumar","Ruba Yoga");
		System.out.println(names);
		
		//looping
		for(var name:names) {
			System.out.println(name);
		}
	}

}
