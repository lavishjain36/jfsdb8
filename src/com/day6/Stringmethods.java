package com.day6;

public class Stringmethods {

	public static void main(String[] args) {
		//Immutable Nature
//		String s1=new String("Lavish");
//		String s2=s1.concat("Jain");
//		System.out.println(s1);//String in java Immutable->Can't modify the content 
//		System.out.println(s2);// it will create another object
//		
//		//Mutable Nature-StringBuilder
//		StringBuilder sb=new StringBuilder("Pavan");//created sb object
//		sb.append("Jain");
//		System.out.println(sb);//on the same object ,the modification is done so mutable		                       so mutable 
		
		
		String str1="LAvish,Jain";
		String str2="lavishj";
		String str3="lavish";
		System.out.println(str1.length());
		
		System.out.println(str1.charAt(2));//v
		
		System.out.println(str1.substring(1,3));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str2.trim());
		System.out.println(str2.replace('l', 'p'));
		System.out.println(str1.contains("Jain"));//to check if char or string present or not
		System.out.println(str1.startsWith("LAvish"));
		System.out.println(str1.endsWith("Jain"));
		System.out.println(str1.indexOf("i"));
		System.out.println(str1.lastIndexOf("i"));

		//Split method->split method convert string into an array of substring ->index
//		or looping->Regex
		String[] parts=str1.split(",");
//		System.out.println(parts[0]);
//		System.out.println(parts[1]);
		//looping
		for(String part:parts) {
			System.out.println(part);
		}
		
		//toCharArray
		char[] charray=str1.toCharArray();
		for(char ch:charray) {
			System.out.println(ch);
		}

		//Anagram
//		System.out.println(str1.isEmpty());//String is not empty
//		System.out.println(str2.compareTo(str3));//postive,zero or negative
		//lexicographically->Unicode comp-ascii value char. by char.
		
		
		//intern()-> canonical reprsentation of string objects.
//		it return string that has same content original string but it has come
//				from pool of unique string
		
		String str4=new String("auvi");
		String str5=str4.intern();
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str4==str5);
		
		System.out.println(str4.codePointAt(0));
		
		//getByte
		
		String str6="ABCD";
	byte[] array=str6.getBytes();
	for(byte b:array) {
		System.out.println(b);
	}
	}

}
