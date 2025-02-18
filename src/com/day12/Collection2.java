package com.day12;

import java.util.Vector;

public class Collection2 {

	//synchronized version of arraylist ->
	//slow as compared to AL->legacy classes->existence but no more in use.
	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
		vector.add("Pune");
		vector.add("Mumbai");
		vector.add("Bengaluru");
		vector.add("Delhi");
		
		System.out.println(vector);
	}

}
