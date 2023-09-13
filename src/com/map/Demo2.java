package com.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

//Identity hashmap demo

public class Demo2 {
public static void main(String[] args) {
	//Map<Integer, String> m = new HashMap<>();
	Map<Integer, String> m = new IdentityHashMap<>();

	Integer i1 = new Integer(100);
	Integer i2 = new Integer(100);
	m.put(i1, "Smruti");
	m.put(i2, "Mouli");
	System.out.println(m);
}
}
