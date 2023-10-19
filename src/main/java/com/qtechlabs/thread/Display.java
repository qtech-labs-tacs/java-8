package com.qtechlabs.thread;

class Display {


	public  void  wish(String name) throws InterruptedException {
		
		for(int i=0; i<10 ;i++) {
			System.out.print("Good Morning");
			
			Thread.sleep(1000);
			System.out.println(name);
		}
		System.out.println("-------------");
	}
	
	
}
