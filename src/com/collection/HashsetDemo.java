package com.collection;

import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		HashSet<Object> h= new HashSet<>();
		h.add("Smruti");
		h.add("A");
		h.add("C");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z"));
		System.out.println(h);
	}

}
