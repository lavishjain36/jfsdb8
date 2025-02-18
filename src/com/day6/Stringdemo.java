package com.day6;

public class Stringdemo {

	public static void main(String[] args) {
		//create a string using literal approach
		String str1="Lavish";//literal approach
		String str2="Lavish";//literal approach->SCP
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3=new String("Lavish");
		System.out.println(str3);
		//comparision
		System.out.println(str1==str2);//true
		System.out.println(str1==str3);//false
		System.out.println(str2==str3);//false
		
//		.equals()->perform comparision->content rather than object loc or references or address or memory location
		
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));//true
	}

}
