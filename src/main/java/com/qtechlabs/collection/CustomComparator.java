package com.qtechlabs.collection;

import java.util.Comparator;

public class CustomComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer num1, Integer num2) {
		return num2.compareTo(num1);
	}

}
