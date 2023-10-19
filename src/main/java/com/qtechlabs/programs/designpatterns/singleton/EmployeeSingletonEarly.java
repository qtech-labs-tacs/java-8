package com.qtechlabs.programs.designpatterns.singleton;


// Early Instantiation/Intialization
public class EmployeeSingletonEarly {

	public static EmployeeSingletonEarly instance = new EmployeeSingletonEarly();
	
	private EmployeeSingletonEarly() {
		
	}
	
	public void veryImportantMethodForInterviewSelection() {
		System.out.println("Selected");
	}
	
	
	public static EmployeeSingletonEarly getInstance() {
		
		if(instance == null) {
			instance = new EmployeeSingletonEarly();
		}
		
		return instance;
		
	}
	
	
}


