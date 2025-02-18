package com.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpresConcept {

	public static void main(String[] args) {
		
//		List<String> names=new ArrayList<>();
		List<String> names=Arrays.asList("Lavish","Booblan","Jackey");
		
		//lambda over this list of elements
		names.forEach( (name)-> System.out.println(name));
		
		
		//lambda {}
		names.forEach((name)->{
			String name1="Hi "+ name;
			System.out.println(name1);
		});

	}

}
