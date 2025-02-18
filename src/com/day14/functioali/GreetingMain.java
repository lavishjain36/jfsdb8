package com.day14.functioali;

public class GreetingMain {

	public static void main(String[] args) {
		//implement functional interface
		Greetings greetings=(name)->System.out.println("Hello "+name);
		
		//call abstract 
		greetings.getwelcome("Rajshekar");

	}

}
