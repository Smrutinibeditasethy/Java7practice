package com.collections;

import java.util.Arrays;
import java.util.Comparator;

//array search

public class Demo5 {
public static void main(String[] args) {
	int[] a = {2, 5, 6, 10, 9, 8};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.binarySearch(a, 5));
	System.out.println(Arrays.binarySearch(a, 11));
	
	String[] b = {"Smr", "Bru", "Don", "pic"};
	Arrays.sort(b);
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.binarySearch(b, "Bru"));
	System.out.println(Arrays.binarySearch(b, "dumb"));
	
	System.out.println("\n");

	Arrays.sort(b, new Mycomp());
	System.out.println(Arrays.binarySearch(b, "Bru", new Mycomp()));
	System.out.println(Arrays.binarySearch(b, "dumb", new Mycomp()));

}
}


class Mycomp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}