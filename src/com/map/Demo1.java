package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//hashmap demo

public class Demo1 {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		//Map<String, Integer> m = new LinkedHashMap<>();
		m.put("Smruti", 100 );
		m.put("Mouli", 200);
		m.put("Deepika", 300);
		m.put("Ajay", 400);
		System.out.println(m);

		System.out.println(m.put("Ajay", 500));
		System.out.println(m);
		
		Set<String> s = m.keySet();
		System.out.println(s);
		
		Collection<Integer> c = m.values();
		System.out.println(c);
		
		Set<Entry<String, Integer>> s1 = m.entrySet();
		System.out.println(s1);
		
		Iterator<Map.Entry<String, Integer>> im = s1.iterator();
		
		while (im.hasNext()) {
			Map.Entry<String, Integer> em = (Map.Entry<String, Integer>) im.next();
			System.out.println(em.getKey() +"..." +em.getValue());
			
			
			if (em.getKey().equals("Smruti")) {
				em.setValue(900);
			} 
		}
		System.out.println();
		System.out.println(m);
	}

}
