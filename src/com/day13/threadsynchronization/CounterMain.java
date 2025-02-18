package com.day13.threadsynchronization;

public class CounterMain {

	public static void main(String[] args) {
		Counter counter=new Counter();
		
		//create 2 threds-functional programming
		Thread t1=new Thread( ()-> {
			for(int i=0;i<50;i++) {
				counter.increment();//increment-1
			}
		});

		Thread t2=new Thread( ()-> {
			for(int i=0;i<50;i++) {
				counter.increment();//increment-2
			}
		});
		
		t1.start();
		t2.start();
		
		
		//thread 2 should not execute before thread1 execution complete->
//		Race condition
		
		try {
			t1.join();//wait for t1
			//main with start its execution
			t2.join();//wait for t2
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(counter.getCount());
		
	}

}
