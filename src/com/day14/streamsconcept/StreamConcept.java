package com.day14.streamsconcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcept {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Lavish","Rajshekar","Banupriya","Ruba Yoga");
		
		//filter function
//		List<String> filterednames=names
//									.stream()
//									.filter(name->name.startsWith("R"))
//									.collect(Collectors.toList());
		
//		System.out.println(filterednames);
		
		
		//map function-
//		List<String> uppercasename=names.stream()
//								.map(String::toUpperCase)
//								.collect(Collectors.toList());
//	
//		System.out.println(uppercasename);
		
		//Sorting on data 
		List<Integer> numbers=Arrays.asList(5,3,8,1,2);
						
		List<Integer> sorteddata=numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sorteddata);
		
		//sum of all digit numbers->reduce()->single digit
		
	    int sum=numbers.stream().reduce(0,Integer::sum);
		System.out.println(sum);
		
		 int max=numbers.stream().reduce(0,Integer::max);
		 System.out.println(max);
	
		 
	}

}
