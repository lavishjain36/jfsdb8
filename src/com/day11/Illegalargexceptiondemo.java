package com.day11;


//Unchecked ->when illegal parameter is passed hrough methods.
public class Illegalargexceptiondemo {
	public static void main(String[] args) {
		try {
			int age=-8;
			if(age<0) {
				throw new IllegalArgumentException("Age can not be negative.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("It will always execute..");
		}
	}

}
