package com.qtechlabs.thread;

public class CustomThread2 extends Thread{

	private Counter counter;
	
	public CustomThread2(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " - " + Thread.currentThread().isDaemon());
		counter.add(4);
	}

	
}
