package com.day14;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceconcept {
	
	
	//static
	public static void displayname(String name) {
		System.out.println(name);
	}
	
	//instance method
		public  void printname(String name) {
			System.out.println(name);
		}
	

	public static void main(String[] args) {
		List<String> cities=Arrays.asList("Pune","Mumbai","Kolkata","Chennai","Hyderabad");
		
//	1.//method to print evey element ::
//		cities.forEach(System.out::println);
	
//	2//static approach ::
//		cities.forEach(MethodReferenceconcept::displayname);
	
//	3.//instance approach 
		//create object of the class 
		MethodReferenceconcept obj=new MethodReferenceconcept();
	
		cities.forEach(obj::printname);//using method reference approach
	}

}
