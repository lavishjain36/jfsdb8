package com.day15.Concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureConcept {

	public static void main(String[] args) {
		
		//create thread of executin 2 jobs
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		
		//submit  callable taskto executor service
		Future<Integer>	future=	executorService.submit(new CallableTask());
		
		System.out.println("Task submitted. wait for the result.");

		
		try {
			if(!future.isDone()) {
				System.out.println("Task is still under progress..");
			}
			Integer res=future.get();
			System.out.println("Task is completed: "+ res);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}finally {
			executorService.shutdown();
		}
	}

}
