package com.day11;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		
		//Unchecked exception.
		try {
			int[] array= {10,20,30};
			System.out.println(array[3]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	
	}

}
