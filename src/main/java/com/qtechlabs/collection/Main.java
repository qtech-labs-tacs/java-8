package com.qtechlabs.collection;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		TreeSet<Integer> setOfInteger = new TreeSet<>();
		
		setOfInteger.add(10);
		setOfInteger.add(20);
		setOfInteger.add(30);
		setOfInteger.add(40);
		setOfInteger.add(50);
		
		System.out.println("DNSO");
		System.out.println(setOfInteger);

		
		
		TreeSet<Integer> customSortingSet = new TreeSet<>(new CustomComparator());
	
//		TreeSet<Integer> customSortingSet1 = new TreeSet<>((Integer num1, Integer num2) -> num1.compareTo(num2));
		
		customSortingSet.add(10);
		customSortingSet.add(20);
		customSortingSet.add(30);
		customSortingSet.add(40);
		customSortingSet.add(50);
		
		
		System.out.println();
		System.out.println("Custom Sorting In Decresing Order");
		System.out.println(customSortingSet);
		
	}

}
