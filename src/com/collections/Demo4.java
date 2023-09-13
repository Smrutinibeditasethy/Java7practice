package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo4 {
public static void main(String[] args) {
	List<Integer> a = new ArrayList<>();
	a.add(10);
	a.add(20);
	a.add(6);
	a.add(12);
	System.out.println("Before reverse : "+a);
	Collections.reverse(a);
	System.out.println("After reverse : "+a);
}
}
