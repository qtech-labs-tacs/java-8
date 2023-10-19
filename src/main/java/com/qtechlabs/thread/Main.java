package com.qtechlabs.thread;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();
		CustomThread thread1 = new CustomThread(counter);
		thread1.start();
		
		synchronized (counter) {
			counter.wait();
		}
		
		for(int i=0; i<10; i++) {
			System.out.println("Wait is over " + i);
		}

	}

}
