package com.day12;

import java.util.PriorityQueue;

public class Collection6 {

	public static void main(String[] args) {
		//preserve insertion-?
//		lower number->comes up 
//		upper number-come down
//		minimum-heap concept.
		
		PriorityQueue pq=new PriorityQueue<>();
		pq.add(60);
		pq.add(34);
		pq.add(5);
		pq.add(10);
		pq.add(24);
		System.out.println(pq);
		
		pq.add(20);
		System.out.println(pq);//insertion order of element doesn't remain same.


	}

}
