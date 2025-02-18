package com.day13.mulitthreading;

public class WorkerMainthread {

	public static void main(String[] args) throws InterruptedException {
		Worker worker=new Worker();
		worker.start();
		worker.join();//main thread wait untill worker class completes execution
		System.out.println("Main thread resumed.");

	}

}
