package com.day11;

//Classcasteexception->if you try to convert an object into incompatible type.
public class ClassCastExceptiondemo {

	public static void main(String[] args) {
		try {
			Object obj="lavish";//it is an objectlavish
			
			//typecast into integer
			Integer num=(Integer)obj;
			
			System.out.println(num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

}
