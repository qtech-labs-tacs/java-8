package com.qtechlabs.programs.garbagecollection;

public class GarbageCollection {

	public static void main(String[] args) {

		String name = new String("Aamir Qureshi");
		name = null;

		Dummy obj = new Dummy();
		obj = null;

		// Type-1
		System.gc();

		
		// Type-2
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();

		System.out.println("End of main.");
	}
}
