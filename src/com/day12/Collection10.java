package com.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Collection10 {

	public static void main(String[] args) {
		
		//BST->all elements 100-left-less and 100-right-must be greater.
		//Inorder Traversal.
		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		
		
		
		System.out.println(ts);
//		System.out.println(ts.ceiling(50));
//		System.out.println(ts.higher(50));
//		System.out.println(ts.lower(50));
		
		System.out.println(ts.ceiling(40));
		System.out.println(ts.higher(40));
		System.out.println(ts.higher(150));
		System.out.println(ts.floor(145));
		System.out.println(ts.lower(120));


		
		
	}

}
