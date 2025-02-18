package com.day12;

import java.util.LinkedHashSet;

public class Collection11 {

	public static void main(String[] args) {
		
		//list format-with unique se of element-Hash table internally
		LinkedHashSet lhs=new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(20);
		lhs.add(10);
		lhs.add(45);
		System.out.println(lhs);

	}

}
