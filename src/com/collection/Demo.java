package com.collection;

import java.util.ArrayList;

//ArrayList demo

public class Demo {
public static void main(String[] args) {
	ArrayList<Object> i = new ArrayList<>();
	i.add(10);
	i.add("Smruti");
	i.add(10);
	i.add(null);
	System.out.println(i);
	i.remove(2);
	System.out.println(i);
	i.set(1, "Mouli" );
	System.out.println(i);
	i.add(1, "Smruti");
	System.out.println(i);
	int a =i.indexOf("Mouli");
	System.out.println(a);
	String b = (String) i.get(2);
	System.out.println(b);
	
}
}
