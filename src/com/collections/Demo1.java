package com.collections;

import java.util.ArrayList;
import java.util.Collections;

//collections sort demo

public class Demo1 {
public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<>();
	a.add("a");
	a.add("k");
	a.add("h");
	a.add("p");
	System.out.println("Before sorting : " +a);
	Collections.sort(a);
	System.out.println("After sorting : "+a);
}
}
