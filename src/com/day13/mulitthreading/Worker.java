package com.day13.mulitthreading;

public class Worker extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Worker thread is completed..");
		} catch (Exception e) {
			System.out.println("Thread interrupted.");
		}
	}
}
