package com.stefanini;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(101, "Mumbai");
		map.put(102, "Amravati");
		map.put(103, "Pune");
		map.put(104, "Vadodara");
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println("keys : "+i);
			System.out.println("Values :"+map.get(i));
		}
		
		

	}

}
