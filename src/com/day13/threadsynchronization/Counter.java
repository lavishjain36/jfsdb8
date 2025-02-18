package com.day13.threadsynchronization;

public class Counter {
	//create variable count-0
	private int count=0;
	
	//both thread should not modify the count.
//	synchronized method 
	public synchronized void increment() {
		count=count+1;
	}
	
	//get the count of both thread
	public int getCount() {
		return count;
	}
	

}
