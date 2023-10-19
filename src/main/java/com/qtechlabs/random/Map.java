package com.qtechlabs.random;

import java.util.LinkedList;
import java.util.List;


public class Map {
	
	private static List<Entry> list = new LinkedList<>();
	
	public void put(String key, String value) {
		Entry entry = new Entry(key, value);
		list.add(entry);
	}
	
	@Override
	public String toString() {
		System.out.print("[ ");
		list.forEach(entry -> System.out.print(entry.toString() + ","));
		
		System.out.print(" ]");
		return "";
	}

}
