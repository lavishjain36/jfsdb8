package com.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection7 {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		
		al.add("Vipul");
		al.add("lavish");
		al.add("Rajashekar");
		al.add("Bava Khan");
		al.add("Mary Jhansi");
				
//		al.remove(1);
		
//		System.out.println(al);
		Iterator<String> it=al.iterator();
		

		while(it.hasNext()) {
			String name=it.next();//retrieve element from the iterator
			System.out.println(name);
		
			if(name.equals("lavish")) {
				it.remove();
			}
		}
		
		//check if lavish
		
		System.out.println("---------------");
		
	
		//print element foreach loop
		for(String name:al) {
			System.out.println(name);
		}
	}

}
