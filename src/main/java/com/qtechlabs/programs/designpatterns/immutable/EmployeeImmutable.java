package com.qtechlabs.programs.designpatterns.immutable;

public class EmployeeImmutable {

	private int age;
	private boolean gender;
	
	public EmployeeImmutable(int age, boolean gender) {
		this.age = age;
		this.gender = gender;
	}

	
	public EmployeeImmutable modifyState(int age, boolean gender) {
		if(this.age == age && this.gender == gender) {
			return this;
		}
		
		return new EmployeeImmutable(age, gender);
	}

	public int getAge() {
		return age;
	}


	public boolean isGender() {
		return gender;
	}

	
	
}