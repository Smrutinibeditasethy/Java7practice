package com.map;

import java.util.Comparator;
import java.util.TreeMap;

//treemap demo

public class Demo4 {
	public static void main(String[] args) {
		TreeMap<String, Integer> t = new TreeMap<>(new MyComparator());
		t.put("Smruti", 100);
		t.put("Ruhi", 300);
		t.put("Priya", 102);
		t.put("Mouli", 101);
		System.out.println(t);
	}

}
 
class MyComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		String s1= (String) o1.toString(); // only for String
		String s2 = (String) o2; //regular type casting for all
		
        return -s2.compareTo(s1);
	}
	
}