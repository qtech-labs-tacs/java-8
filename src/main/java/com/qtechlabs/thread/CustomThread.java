package com.qtechlabs.thread;

public class CustomThread extends Thread{

	private Counter counter;
	
	public CustomThread(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public synchronized void run() {
		for(int i=0; i<100; i++) {
			System.out.println("I am " + Thread.currentThread().getName() + " "+ i);
			counter.count = counter.count + 1;
			
			synchronized (counter) {
				if (counter.count == 10) {
					counter.notify();
					System.out.println("Notification is being sent");
				}
			}
		}

		
		
	}

	
}
