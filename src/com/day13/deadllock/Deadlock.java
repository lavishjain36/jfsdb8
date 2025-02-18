package com.day13.deadllock;

public class Deadlock {
	
	//two resources
	private static final Object lock1=new Object();
	private static final Object lock2=new Object();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create 2 threds-functional programming
				Thread t1=new Thread( ()-> {
					synchronized (lock1) {
						System.out.println("Thread-1 .Holding lock -1");
					}
					
					try {
						Thread.sleep(500);
						
					} catch (InterruptedException e) {
						System.out.println(e);
					}
					
					System.out.println("Thread 1:Waiting for lock 2...");
					
					synchronized (lock2) {
						System.out.println("Thread-1 .Acquire lock 2");
					}
				});

				Thread t2=new Thread( ()-> {
					synchronized (lock1) {
						System.out.println("Thread-2 .Holding lock -2");
					}
					
					try {
						Thread.sleep(500);
						
					} catch (InterruptedException e) {
						System.out.println(e);
					}
					
					System.out.println("Thread 2:Waiting for lock 1...");
					
					synchronized (lock2) {
						System.out.println("Thread-2 .Acquire lock 1.");
					}
				});
				
				t1.start();
				t2.start();
	}

}
