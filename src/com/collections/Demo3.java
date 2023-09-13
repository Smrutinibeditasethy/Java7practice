package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("a");
		a.add("k");
		a.add("h");
		a.add("p");
		System.out.println("Before sorting : " +a);
		Collections.sort(a);
		System.out.println("After sorting : " +a);
System.out.println(Collections.binarySearch(a, "h"));
System.out.println(Collections.binarySearch(a, "j"));
	}

}
