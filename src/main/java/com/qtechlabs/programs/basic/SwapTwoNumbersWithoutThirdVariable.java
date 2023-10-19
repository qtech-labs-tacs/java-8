package com.qtechlabs.programs.basic;

public class SwapTwoNumbersWithoutThirdVariable {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("Numbers before swapping: a = " + a + ", b = " + b);
		

		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Numbers after swapping: a = " + a + ", b = " + b);

	
	}

}
