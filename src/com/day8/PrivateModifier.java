package com.day8;

public class PrivateModifier {

	//scope->limited to this class only
	
	private int data=20;
	
	private void getdata() {
		System.out.println(data);
	}
	public static void main(String[] args) {
		
		//create an object in main method
		PrivateModifier obj=new PrivateModifier();
		obj.getdata();

	}

}
