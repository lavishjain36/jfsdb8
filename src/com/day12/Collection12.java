package com.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection12 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
//		/using normal for loop with collection objects
		for(int i=0;i<al.size();i++) {
		Object obj=al.get(i);
		System.out.print(obj+" ");
		}
		
		System.out.println();
		//foreach loop
		for (Object object : al) {
			System.out.print(object+" ");
		}
		System.out.println();
		//Iterator ->Object into 
		Iterator itr=al.iterator();
		
		
		while(itr.hasNext()) {
			////fetch the data using object
//			Object obj=itr.next();
//			System.out.print(obj+" ");//Object data 
			
			//Convert into integer-Typecasting
			Integer i=(Integer)itr.next();
			System.out.print(i+" ");
			
			
			System.out.println();

			//acess element in reverse-al and ll.
			
			ListIterator litr=al.listIterator(al.size());
//			System.out.println(litr);
			while(litr.hasPrevious()) {
				System.out.print(litr.previous()+" ");
			}
			
		}

	}

}
