package com.stefanini;

import java.util.HashSet;
import java.util.Set;

public class DemoHashSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(12);
		set.add(14);
		set.add(16);
		
		
		for(Integer i: set ) {
			System.out.println(i);
		}
		
		
	}

}
