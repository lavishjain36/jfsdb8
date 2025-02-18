package com.day11;

public class ArithmaticExceptionDemo {

	//Unchecked exception.
	public static void main(String[] args) {
		System.out.println("This is line-1");
		System.out.println("This is line-2");
		System.out.println("This is line-3");
		
		//handle line-10 risky code in 
		try {
			int num1=20,num2=0;
			System.out.println(num1/num2);//risky code->try block
		} catch (ArithmeticException e) {
			System.out.println("Can't divide number by zero. Enter valid positive number");
		}
		System.out.println("This is line-4");
		System.out.println("This is line-5");
		
	}

}
