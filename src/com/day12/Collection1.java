package com.day12;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
//		List al=new ArrayList<>();//create an object arraylist.
		
		ArrayList al1=new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		
		System.out.println(al1);//homogenous element only
 		
		ArrayList al2=new ArrayList<>();
		al2.add("Lavish");
		al2.add(25);
		al2.add('l');
		al2.add(10.5);
		
		System.out.println(al2);//Heterogenous collection objects
		
		//copy entire collection of al1 and al into 3rd object
		ArrayList al3=new ArrayList<>();
		al3.addAll(al2);
		al3.addAll(al1);
		System.out.println(al3);//al1 and al2->combined->al3
		
		al3.add(1, "Swapnil");
		System.out.println(al3);
		
		System.out.println(al3.isEmpty());
		
		al3.remove(0);
		
		System.out.println(al3);

		al3.add(25);
		System.out.println(al3);
	}

}
