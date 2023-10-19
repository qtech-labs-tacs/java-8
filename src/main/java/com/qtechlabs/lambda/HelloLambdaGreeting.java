package com.qtechlabs.lambda;

public class HelloLambdaGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello Lambda");
	}

}
