package com.collection;

import java.util.TreeSet;

public class TreesetDemo1 {
public static void main(String[] args) {
	TreeSet<StringBuffer> t = new TreeSet<>();
	t.add(new StringBuffer("A"));
	t.add(new StringBuffer("H"));
	t.add(new StringBuffer("W"));
	t.add(new StringBuffer("M"));
	t.add(new StringBuffer("C"));
	System.out.println(t);
			

}
}
