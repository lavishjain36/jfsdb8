package com.day12;

import java.util.HashSet;
import java.util.Iterator;

public class Collection8 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add(5);
		hs.add(24);
		hs.add(10);
		hs.add(10);
		hs.add(45);
		hs.add("lavish");
		hs.add("pavan");
		hs.add("kushal");
		hs.add("lavish");
		
//		System.out.println(hs);
//		System.out.println(hs.size());
		
		Iterator it=hs.iterator();
//		System.out.println(it);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
