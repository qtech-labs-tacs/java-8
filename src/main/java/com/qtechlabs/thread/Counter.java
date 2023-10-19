package com.qtechlabs.thread;

public class Counter {

	protected long count = 0;

	public synchronized void add(long value) {
		this.count = this.count + value;
	}

	
	// getter & setter
	public static void printMessage() {
		System.out.println("Hello World");
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

}