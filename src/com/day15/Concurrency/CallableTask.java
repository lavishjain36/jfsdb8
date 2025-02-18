package com.day15.Concurrency;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer>{

	//override the call method
	@Override
	public Integer call() throws Exception {
		//thread->must take pause 2 second
		Thread.sleep(5000);
		return 10+20;
	
	}

}
