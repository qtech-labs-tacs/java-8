package com.qtechlabs.lambda;

import java.util.LinkedList;
import java.util.function.BiPredicate;

public class Greeter {

	private String message;

	public Greeter(String message) {
		this.message = message;
	}

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		Message message = () -> System.out.println("Hello World");
		message.message();

		CustomMessage customMessage = (String name) -> System.out.println(name);
		customMessage.message("Hello Custom Lambda");

		GreaterThanFunction gtFunction = (int a, int b) -> {
			if (a < b) {
				System.out.println(b + " is greater than " + a);
			} else {
				System.out.println(a + " is greater than " + b);
			}
		};

		gtFunction.greaterNumber(10, 20);
		gtFunction.greaterNumber(-1, -2);

		BiPredicate<String, String> rocks = (String message1, String message2) -> {
			if (message1.equalsIgnoreCase(message2)) {
				return true;
			}
			return false;
		};

		boolean test = rocks.test("aamir", "aamir");
		System.out.println(test);

		checkEquality(rocks, "aamir", "qureshi");
		checkEquality((String message1, String message2) -> {
			if (message1.equalsIgnoreCase(message2)) {
				return true;
			}
			return false;
		}, "Hello", "heLlO");

		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Hello World");
		list.add("10");
		
		try {
			String greeting =  list.get(1);
			System.out.println(greeting);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		
		
	}

	public static void checkEquality(BiPredicate<String, String> lambda, String msg1, String msg2) {
		lambda.test(msg1, msg2);
	}

}
