package com.day12;

import java.util.LinkedList;

public class Collection4 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList<>();
		
		ll.add("lavish");
		ll.add("swapnil");
		ll.add("Rajshekar");
		ll.add("Banupriya");
		ll.add("Suriya sekar");
		System.out.println(ll);
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.getClass());
//		System.out.println(ll.get(3));
		
		ll.addFirst(15);
		System.out.println(ll);
		ll.addLast(35);
		System.out.println(ll);
		
		//collection data should not affected peekfirst and peeklast
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		
		System.out.println(ll);
		
		//it will moves object permanently from the collection
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());

		
		System.out.println(ll);

		
		
	}

}
