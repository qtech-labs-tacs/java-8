package com.qtechlabs.programs.designpatterns.singleton;


// Lazy Instantiation/Intialization
 class EmployeeSingletonLazy {

	public static EmployeeSingletonLazy instance;
	
	private EmployeeSingletonLazy() {
		
	}
	
	public void veryImportantMethodForInterviewSelection() {
		System.out.println("Selected");
	}
	
	
	public static EmployeeSingletonLazy getInstance() {
		
		if(instance == null) {
			instance = new EmployeeSingletonLazy();
		}
		
		return instance;
		
	}
	
	
}


