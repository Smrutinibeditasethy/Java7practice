package com.concurrentcollection;

import java.util.concurrent.ConcurrentHashMap;

public class Demo1 {
public static void main(String[] args) {
	ConcurrentHashMap m = new ConcurrentHashMap();
	m.put(101, "A");
	m.put(102, "B");
	m.putIfAbsent(103, "C");
	System.out.println(m);
	m.putIfAbsent(101, "D");
	m.remove(101, "D");
	m.replace(102, "B", "E");
	System.out.println(m);
}
}
