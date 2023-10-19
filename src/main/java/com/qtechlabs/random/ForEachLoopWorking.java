package com.qtechlabs.random;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ForEachLoopWorking {
	
	public static void main(String[] args) {
		
		
		
		Map<Integer, Employee> employeeIdToNameMap = new HashMap<Integer, Employee>();
	
		
		employeeIdToNameMap.put(1, new Employee(1l, "faraz"));
		employeeIdToNameMap.put(2, new Employee(2l, "shadab"));
		employeeIdToNameMap.put(3, new Employee(3l, "ahadab"));
		employeeIdToNameMap.put(4, new Employee(4l, "bhadab"));
		employeeIdToNameMap.put(5, new Employee(5l, "Schadab"));
		employeeIdToNameMap.put(6, new Employee(6l, "dhadab"));
		
		
		Set<Entry<Integer, Employee>> entrySet = employeeIdToNameMap.entrySet();
		
		for (Entry<Integer, Employee> entry : entrySet) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("----------------");
			System.out.println("----------------");
		}
	

	}

	
}


