package com.collection;

import java.util.LinkedList;

//linkedList demo

public class Demo2 {
	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<>();
		l.add("Smruti");
		l.add(null);
		l.add("20");
		l.add(true);
		l.add("Smruti");
		System.out.println(l);
		l.set(1, "Mouli");
		l.set(3, "bubu");
		System.out.println(l);
		l.removeLast();
		l.addFirst("Pooja");
		System.out.println(l);
	}

}
