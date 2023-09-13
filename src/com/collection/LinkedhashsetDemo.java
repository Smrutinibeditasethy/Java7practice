package com.collection;

import java.util.LinkedHashSet;

public class LinkedhashsetDemo {
public static void main(String[] args) {
	LinkedHashSet<Object> lhs = new LinkedHashSet<>();
	lhs.add("Smruti");
	lhs.add("A");
	lhs.add("C");
	lhs.add(null);
	lhs.add(10);
	System.out.println(lhs);
}
}
