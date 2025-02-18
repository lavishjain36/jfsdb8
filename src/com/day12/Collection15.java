package com.day12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collection15 {

	public static void main(String[] args) {
//		HashMap<Integer, String> map=new HashMap<Integer, String>();
//		
//		map.put(101, "Abhay");
//		map.put(102, "Sujay");
//		map.put(103, "Manjay");
//		map.put(104, "Ajay");
//		map.put(105, "Abhay");
//		map.put(102, "lavish");
//
//		
//		System.out.println(map);
//		map.remove(102);
//		System.out.println(map);
//		map.remove(105, "Abhay");
//		System.out.println(map);
		
		
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		map.put(101, "Abhay");
		map.put(102, "Sujay");
		map.put(103, "Manjay");
		map.put(104, "Ajay");
		map.put(105, "Abhay");
		
		System.out.println(map);
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println(map.descendingMap());
		
		System.out.println(map.tailMap(103,true));//greater than or equal to the key number
		
		
		//store-linkedlist-linkedlist+hashtable+map interface->key,value
		LinkedHashMap<Integer, String> map1=new LinkedHashMap<Integer, String>();
		
		
	}

}
