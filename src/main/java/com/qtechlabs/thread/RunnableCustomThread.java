package com.qtechlabs.thread;

public class RunnableCustomThread implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().getName() + " - Custom Thread Iteration - " + i);
		}
	}

	
	
}
