package com.day8.hierarichical;

public class Main {

	public static void main(String[] args) {
		//i have to call only class A method
		A obj1=new A();
		obj1.getA();
		
		//i have to call both A & B class method
		B obj2=new B();
		obj2.getA();
		obj2.getB();
		
		// i have to access both A & C class method
		C obj3=new C();
		obj3.getA();
		obj3.getC();
		
	}

}
