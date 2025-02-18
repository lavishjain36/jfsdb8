package com.day11;

public class NullPointerexceptiondemo {

	public static void main(String[] args) {
		//Unchecked Exception.
		try {
			String str=null;
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
