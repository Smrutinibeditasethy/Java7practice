package com.collection;

import java.util.TreeSet;

public class TreeSetDemo7 {
public static void main(String[] args) {
	TreeSet<Integer> t = new TreeSet<>(new MyComparator());
	t.add(10);
	t.add(0);
	t.add(8);
	t.add(11);
	t.add(1);
	t.add(5);

System.out.println(t);
}
}
