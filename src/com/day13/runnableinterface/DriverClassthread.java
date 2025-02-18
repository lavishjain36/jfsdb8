package com.day13.runnableinterface;

public class DriverClassthread {

	public static void main(String[] args) {
		MyRunnable mr=new MyRunnable();
		
		
		//need to create object of thread class
		Thread th1=new Thread(mr,"Thread-1");
		Thread th2=new Thread(mr,"Thread-2");
		
		th1.start();
		th2.start();

	}

}
