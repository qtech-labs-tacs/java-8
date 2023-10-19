package com.qtechlabs.lambda;

import java.util.TreeSet;

import com.qtechlabs.random.Employee;

public class Main {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(100);
		set.add(21);
		set.add(30);
		set.add(70);
		set.add(90);

		System.out.println(set);

//		TreeSet<Integer> set1 = new TreeSet<Integer>((Integer number1, Integer number2) -> {
//			if(number1.intValue() == number2.intValue()) {
//				return 0;
//			}
//			
//			if(number1.intValue() < number2.intValue()) {
//				return 1;
//			}else {
//				return -1;
//			}
//		});
//		set1.add(100);
//		set1.add(21);
//		set1.add(30);
//		set1.add(70);
//		set1.add(90);
//		
//		System.out.println(set1);

		TreeSet<Employee> set1 = new TreeSet<Employee>(
				(Employee x, Employee y) -> (x.getId() < y.getId()) ? -1 : ((x.getId() == y.getId()) ? 0 : 1));
		

		System.out.println(set1);

		TreeSet<Integer> set3 = new TreeSet<Integer>();
		set3.add(100);
		set3.add(21);
		set3.add(30);
		set3.add(70);
		set3.add(90);

		System.out.println(set3);

	}

}
