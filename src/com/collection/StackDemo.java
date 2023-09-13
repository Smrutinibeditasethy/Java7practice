package com.collection;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack<Object> s = new Stack<>();
	s.push("Smruti");
	s.push("A");
	s.push("C");
	s.push("popo");
	System.out.println(s);
	System.out.println(s.search("A"));
	System.out.println(s.search("B"));
}
}
