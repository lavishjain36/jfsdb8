package com.day13;

public class MainClassthread {

	public static void main(String[] args) {
		Mythread th1=new Mythread();
		Mythread th2=new Mythread();

		
		//start both thread concurrently
		th1.start();//starting the first
		th2.start();//starting second
		
		for(int i=1;i<=10;i++) {
			System.out.println("Main Thread");
		}

		
	}

}
