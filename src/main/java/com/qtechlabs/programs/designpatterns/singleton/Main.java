package com.qtechlabs.programs.designpatterns.singleton;

public class Main {
	
	public static void main(String[] args) {
		EmployeeSingletonEarly obj1 = EmployeeSingletonEarly.getInstance();
		
		EmployeeSingletonEarly obj2 = EmployeeSingletonEarly.getInstance();
		
		
		if(obj1.hashCode() == obj2.hashCode()) {
			System.out.println("Same Object");
		}else {
			System.out.println("Different Object");
		}
		
		
		obj1 = null;
		obj2 = null;
		
		
	}

}
