package com.day13;


//implement thread concept using thread extends
public class Mythread extends Thread {
	@Override
	public void run() {
		//provide own implementation
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"-Count:"+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
