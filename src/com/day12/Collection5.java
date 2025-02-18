package com.day12;

import java.util.ArrayDeque;

public class Collection5 {

	public static void main(String[] args) {
//		doubled ended queue->add and remove element from the both.
//		insertion and deletion->from rear and frontend 
//		ArrayDequeue->Dequeue in/terface->Queue interface
		ArrayDeque ad=new ArrayDeque<>();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		
		System.out.println(ad);
		ad.addFirst(45);
		ad.addLast(56);
		System.out.println(ad);

	}

}
