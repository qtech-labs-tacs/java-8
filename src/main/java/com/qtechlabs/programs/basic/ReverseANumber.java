package com.qtechlabs.programs.basic;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		int number = 721;
		
		System.out.println("Original Number: " + number);
		int reverseNumber = 0;
		
		while(number != 0) {
			int remainder = number % 10;		// 1, 2, 7
			reverseNumber = (reverseNumber*10) + remainder;		// 1, 12, 127
			number = number/10;			// 72, 7 
		}
		
		System.out.println("Reverse Number: " + reverseNumber);
	}

}
