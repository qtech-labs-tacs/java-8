package com.qtechlabs.lambda;

import java.util.function.Function;

public class LambdaExample3 {

	public static void main(String[] args) {
		
		
		Function<String, Integer> stringCount = str -> str.length();
		print(stringCount, "aamir");
	}
	
	
	public static void print(Function<String, Integer> stringCount, String string) {
		System.out.println("Length of string input [" + string + "] is " +stringCount.apply(string));
	}
	
}
