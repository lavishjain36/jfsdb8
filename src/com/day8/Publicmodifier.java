package com.day8;

public class Publicmodifier {
	public int num=50;
	
	
	public void getdata() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		Publicmodifier obj=new Publicmodifier();
		obj.getdata();

	}

}
