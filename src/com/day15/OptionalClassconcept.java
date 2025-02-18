package com.day15;

import java.lang.StackWalker.Option;
import java.util.Optional;

public class OptionalClassconcept {

	public static void main(String[] args) {
		//create optional with value
//		Optional<String> value=Optional.of("Lavish jain");
//		System.out.println(value.isPresent());
//	
//		Optional<String> value1=Optional.empty();
//		System.out.println(value1.isPresent());//false
	
//		value.ifPresent(v->System.out.println(v));
		
//		value1.ifPresent(v1->System.out.println(v1));//Null pointer exception
		
//		String text=null;
//		System.out.println(text.charAt(0));
		
//	String newvalue=value.orElse("Guvi Hcl");
//	System.out.println(newvalue);
	
//	String newvalue1=value.orElseGet(()->"This is new data.");
//	System.out.println(newvalue1);
	
	
//	try {
//		String value3=value1.orElseThrow(()->new  RuntimeException("Value not found.."));
//	} catch (RuntimeException e) {
//		// TODO Auto-generated catch block
//		System.out.println(e.getMessage());
//	}
	
		
	Optional<String> name=Optional.ofNullable(null);
	
	System.out.println(name.isPresent());
		
	System.out.println(name.orElse("Lavish Jain"));
    try {
		String newvalue=name.orElseThrow(()->new NullPointerException("Value is null."));
	} catch (NullPointerException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}

		
		
	}

}
