package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo2 {
public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<>();
	a.add("a");
	a.add("k");
	a.add("h");
	a.add("p");
	System.out.println("Before sorting : " +a);
	Collections.sort(a, new MyCompo());
	System.out.println("After sorting : " +a);
}
}

class MyCompo implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}