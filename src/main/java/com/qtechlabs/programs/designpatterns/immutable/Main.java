package com.qtechlabs.programs.designpatterns.immutable;

public class Main {
	
	public static void main(String[] args) {
		
		EmployeeImmutable obj = new EmployeeImmutable(10, false);
		
		
		int age = obj.getAge();
		boolean gender = obj.isGender();
		
		System.out.println("Age: " + age + ", Gender: " + gender);
		
		
		
	}

}
