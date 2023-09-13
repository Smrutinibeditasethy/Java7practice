package com.collection;

import java.util.Vector;

//vector example

public class Demo3 {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<>();
		System.out.println(v.capacity());
		
		for (int i = 1; i <=10; i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("Smruti");
		System.out.println(v.capacity());
		System.out.println(v);
		v.removeElementAt(5);
		System.out.println(v);
		
	}

}
