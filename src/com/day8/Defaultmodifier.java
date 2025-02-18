package com.day8;

public class Defaultmodifier {
	int num=10;
	
	void display() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Defaultmodifier obj=new Defaultmodifier();
		obj.display();

	}

}
