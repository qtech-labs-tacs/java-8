package com.qtechlabs.thread;

public class MyThread extends Thread {

	private Display display;
	private String name;

	public MyThread(Display display, String name) {
		this.display = display;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			display.wish(name);
		} catch (InterruptedException e) {

		}

	}

}
