package com.day11;

//Can you convert string into number
//string can't be converted number
//Unchecked exception
public class NumberFormatDemo {

	public static void main(String[] args) {
		 try {
			int number=Integer.parseInt("guvi");
			System.out.println(number);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
