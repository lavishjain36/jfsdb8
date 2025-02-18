package com.day6;

public class Stringnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="abc";
//		String s2="abc";
		String s1=new String("Lavish");
		String s2=new String("Dilip");
		


//		==comparision
//				s1 and s2 refer to same object or not
		if(s1==s2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

	}

}
