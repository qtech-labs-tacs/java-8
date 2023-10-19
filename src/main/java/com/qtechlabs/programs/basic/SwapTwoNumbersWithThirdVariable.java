package com.qtechlabs.programs.basic;

public class SwapTwoNumbersWithThirdVariable {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("Numbers before swapping: a = " + a + ", b = " + b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Numbers after swapping: a = " + a + ", b = " + b);

	
	}

}
