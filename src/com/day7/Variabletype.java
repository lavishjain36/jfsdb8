package com.day7;

public class Variabletype {

	int num=20;//Instance variable
	
	static int num1=100;//static variable

	//Constructor
	Variabletype(){
		System.out.println("This is default constructor");
	}
	
	// Blocks
	
	//static block-1-internally
	static {
		System.out.println("This is static Block");
	}
	//instance block-2
	{
		System.out.println("This is instance block");
	}

	//Method->two types of methods
//	1.Static Method 
	private static void getstaticdata() {
		System.out.println("Static Method");
	}
//	2.Instance Method or Non-Static Method
	private void getinstancedata() {
		System.out.println("Instance Method");
	}
	public static void main(String[] args) {
		
	    int num=10;//Local Variable
	    System.out.println("Local variable "+ num);//10
	    
	    //create an object of class 
	    Variabletype objref=new Variabletype();
	    System.out.println("Instance Variable :"+ objref.num);//20
	    	    
	    //TO acess static variable->Classname.variablename
	    System.out.println("Static Variable "+Variabletype.num1);

	    
	    //How to call static method?->Classname.methodname()->static approach
	    Variabletype.getstaticdata();
	    
	    //How to call Instance method->objectref.methodname();
	    objref.getinstancedata();
	}

}
