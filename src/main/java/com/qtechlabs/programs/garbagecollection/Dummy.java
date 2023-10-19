package com.qtechlabs.programs.garbagecollection;

public class Dummy {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize Method Of Dummy Class Called");
	
	}
	

	
	
}
