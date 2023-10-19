package com.qtechlabs.random;

import java.util.WeakHashMap;

public class Main {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Integer one = new Integer(10);
		
		
		WeakHashMap<Integer, String> map = new WeakHashMap<Integer, String>();
		map.put(one, "one");
		System.out.println(map);
		System.out.println();
		
		
		one=null;
		
		System.gc();
		Thread.sleep(5000);
		
		System.out.println(map);
		
		
	}

}
